package action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import Dao.IUserServiceDao;
import Dao.UserServiceDaoImpl;

@Action(value = "login",results ={@Result(name="success",location = "/result.jsp" ),
		@Result(name="failure",location = "/register.jsp")})
public class LoginAction {
	String emailId;
	String password;
	
	
	private IUserServiceDao userServiceDao=UserServiceDaoImpl.getInstance();
	
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
		
		if(userServiceDao.login(emailId, password))
		return "success";
		else
			return "failure";
	}
}
