package action;

public class ResetPasswordAction {
	
	String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	String execute() {
		
		return "success";
	}
}
