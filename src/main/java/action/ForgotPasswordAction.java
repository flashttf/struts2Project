package action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import Dao.IUserServiceDao;
import Dao.UserServiceDaoImpl;


@Action(value = "forgotpasswordaction",results = {@Result(name = "success" ,location = "/resetpassword.jsp"),
		@Result(name = "success",location = "/register.jsp")})
public class ForgotPasswordAction {
	
	String emailId;
	
	IUserServiceDao userServiceDao=new UserServiceDaoImpl();
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	String execute() {
		System.out.println("axdadadad");
		if(userServiceDao.forgotPassword(emailId)) {
			return "success";
		}
		else {
			return "failure";
		}
	}
}
