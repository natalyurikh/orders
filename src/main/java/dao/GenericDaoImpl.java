package dao;

import org.hibernate.SessionFactory;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import javax.inject.Inject;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;


/**
 * @author Natalya_Urikh
 */
public class GenericDaoImpl<T> extends HibernateDaoSupport implements GenericDao<T>
{

	@Inject
	public void initSessionFactory (SessionFactory sessionFactory)
	{
		setSessionFactory(sessionFactory);
	}

	private Class<T> type;

	protected Class<T> getType()
	{
		return this.type;
	}

	protected String getClassName()
	{
		return type.getName();
	}

	@SuppressWarnings("unchecked")
	public GenericDaoImpl()
	{
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class)pt.getActualTypeArguments()[0];
	}

	@Override
	public void delete(T obj)
	{
		getSession().delete(obj);
	}

	@Override
	public T find (Integer id)
	{
		return (T)getHibernateTemplate().get(type, id);
	}

	@Override
	public void save (T obj)
	{
		getHibernateTemplate().saveOrUpdate(obj);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll()
	{
		return (List<T>)getHibernateTemplate().find("FROM " + type.getName());
	}

	@Override
	public Integer countAll()
	{
		return DataAccessUtils.intResult(getHibernateTemplate().find("select count(*) from " + type.getName()));
	}

	public void setHibernateSessionFactory(SessionFactory hibernateSessionFactory)
	{
		setSessionFactory(hibernateSessionFactory);
	}
}