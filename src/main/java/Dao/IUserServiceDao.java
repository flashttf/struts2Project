package Dao;

import pojo.User;

public interface IUserServiceDao {
	public String register(User user);
	public String login(String email,String password);
	public String forgotPassword(String email);
	public String resetPassword(String password);
}
