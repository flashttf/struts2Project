package action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;


import Dao.IUserServiceDao;
import Dao.UserServiceDaoImpl;
import pojo.User;


@Action(value="register",results = {@Result(name="success",location ="/login.jsp" ),
		@Result(name = "failure",location = "/index.jsp")})
public class RegisterAction {
	String userName;
	String phoneNumber;
	String emailId;
	String password;
	
	private IUserServiceDao userServiceDao=UserServiceDaoImpl.getInstance();
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String execute() {
		User user=new User();
		user.setUserName(getUserName());
		user.setEmailId(getEmailId());
		user.setPhoneNumber(getPhoneNumber());
		user.setPassword(getPassword());
		if(userServiceDao.register(user)!=null) {
			return "success";
		}else {
			return "failure";
		}
		
	}
}
