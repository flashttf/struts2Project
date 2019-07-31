package Utility;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;





public class MailSender implements IMailSender{
	
	private final String senderEmail="fundooapp7293@gmail.com";
	private final String password="zophar123";
	
	

	public boolean sendMail(String receiverEmail, String subject, String message) {
			
		Properties properties=new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port","587");
		
		Session session=Session.getInstance(properties,new javax.mail.Authenticator()
				{
				protected PasswordAuthentication getPasswordAuthentication(){
					return new PasswordAuthentication(senderEmail, password);
				}
				});
		
		try {
			Message messageObj=new MimeMessage(session);
			messageObj.setFrom(new InternetAddress(senderEmail));
			
			messageObj.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiverEmail));
			
			messageObj.setSubject(subject);
			
			messageObj.setText(message);
			Transport.send(messageObj);
			
			return true;
		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
