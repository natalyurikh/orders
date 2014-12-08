package dao;

import java.util.List;

/**
 * @author Natalya_Urikh
 */
public interface GenericDao<T>
{
	void delete(T obj);
	T find(Integer id);
	void save (T t);
	List<T> findAll();
	Integer countAll();
	//void delete(T t);
}
