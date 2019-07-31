package Dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Utility.HibernateUtility;
import Utility.IMailSender;
import Utility.MailSender;
import pojo.User;

public class UserServiceDaoImpl implements IUserServiceDao{
	
	private static UserServiceDaoImpl userServiceDaoImpl;
	
	IMailSender mailSender=new MailSender();

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
		return user.getUserName();
	}

	public boolean login(String email, String password) {
		Session session=HibernateUtility.getSessionFactory().openSession();
		Transaction trans=session.beginTransaction();
		Query query=session.createQuery("from "+User.class.getName()+" where emailId= :emailId");
		query.setParameter("emailId", email);
		User user=(User) query.uniqueResult();
		String passwordNew="";
		if(user!=null) {
		passwordNew	=user.getPassword();
		}else {
			return false;
		}
		
		trans.commit();
		session.close();
		
		if(passwordNew!=null) {
			
		
		if(passwordNew.equals(password))
		return true;
		else
			return false;
		}else {
			return false;
		}
	}

	public boolean forgotPassword(String emailId) {
		Session session=HibernateUtility.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("*from "+User.class.getName()+" where emailId= :emailId");
		query.setParameter("emailId", emailId);
		User user=(User) query.uniqueResult();
		transaction.commit();
		session.close();
		if(user!=null) {
			mailSender.sendMail(emailId, "Reset-Password Link", "http://localhost:8080/struts2/resetpassword.jsp");
			
			
			return true;
		}
		return false;
	}

	public boolean resetPassword(String password) {
		
		return false;
	}

}
