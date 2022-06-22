package model;

import java.io.Serializable;

public class Account implements Serializable {
	private int userId;
	private String userName;
	private String pass;
	
public Account(String userName,String pass) {
		
		
		this.userName=userName;
		this.pass=pass;
	}
	
	public Account(int userId,String userName,String pass) {
		
		this.userId=userId;
		this.userName=userName;
		this.pass=pass;
	}

	public int getUserId() {return userId;}
	public void setUserId(int userId ) {this.userId=userId;}
	public String getUserName() {return userName;}
	public void setUserName(String userName) {this.userName=userName;}
	public String getPass() {return pass;}
	public void setPass(String pass) {this.pass=pass;}
}
