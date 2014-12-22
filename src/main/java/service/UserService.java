package service;

import dao.UserDao;
import model.User;

import java.util.List;

/**
 * @author Natalya_Urikh
 */
public class UserService
{
	private UserDao userDao = new UserDao();

	public void register(User user)
	{
		userDao.save(user);
	}

	public List<User> findAll()
	{
		System.out.println(this.getClass() + ". Find all");
		return userDao.findAll();
	}

}
