package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Utility.HibernateUtility;
import pojo.User;

public class UserServiceDaoImpl implements IUserServiceDao{
	
	private static UserServiceDaoImpl userServiceDaoImpl;
	
	

	public UserServiceDaoImpl() {
		
	}
	
	public static synchronized UserServiceDaoImpl getInstance() {
		if(userServiceDaoImpl==null) {
			userServiceDaoImpl=new UserServiceDaoImpl();
			return userServiceDaoImpl;
		}
		return userServiceDaoImpl;
	}

	public String register(User user) {
		SessionFactory sessionFactory=HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		return user.getName();
	}

	public String login(String email, String password) {
		
		return null;
	}

	public String forgotPassword(String email) {
		
		return null;
	}

	public String resetPassword(String password) {
		
		return null;
	}

}
