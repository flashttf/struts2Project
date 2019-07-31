package Dao;

import pojo.User;

public interface IUserServiceDao {
	public String register(User user);
	public boolean login(String email,String password);
	public boolean forgotPassword(String emailId);
	public boolean resetPassword(String password);
}
