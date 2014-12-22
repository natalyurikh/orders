package service;

import dao.UserDao;
import model.User;

import java.util.List;

/**
 * @author Natalya_Urikh
 */
public class UserService
{
	public List<User> findAll()
	{
		System.out.println(this.getClass() + ". Find all");
		UserDao userDao = new UserDao();
		return userDao.findAll();
	}

}
