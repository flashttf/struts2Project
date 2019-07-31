package Utility;

public interface IMailSender {
	public boolean sendMail(String receiverEmail,String subject,String message);
}
