package action;

public class ForgotPasswordAction {
	
	String emailId;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	String execute() {
		return "success";
	}
}
