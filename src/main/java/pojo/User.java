package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private	long userId;
	
	@Column(name="name")
	private	String name;
	
	@Column(name="phoneNumber")
	private	String phoneNumber;
	
	@Column(unique=true,name="emailId")
	private	String emailId;
	
	@Column(name="password")
	private	String password;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId
				+ ", password=" + password + "]";
	}

	public User(long userId, String name, String phoneNumber, String emailId, String password) {
		
		this.userId = userId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.password = password;
	}

	public User() {
		
	}
	
	
}
