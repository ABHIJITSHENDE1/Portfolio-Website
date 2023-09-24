package com.validation;

public class Validation {

	private String result ;
	public String validateMessage(String name, String email, String message) {
		int nameLen = name.length();
		int emailLen = email.length();
		int messageLen = message.length();
		
		if(nameLen < 2 || nameLen >50) {
			result = "Invalid Name";
		}
		else if(emailLen < 5 || emailLen > 50) {
			result = "Invalid Email";
		}
		else if(messageLen < 10 || messageLen > 1000) {
			result = "Invalid Message";
		}
		else {
			result = "Valid";
		}
		
		return result;
	}
	
	public String validateLoginData(String username, String password) {
		int usernameLen = username.length();
		int passwordLen= password.length();
		if(usernameLen < 5 || usernameLen >30) {
			result = "Invalid UserName";
		}
		else if(passwordLen < 5 || passwordLen > 30) {
			result = "Invalid Password";
		}
		else {
			result = "Valid";
		}
		return result;
	}

}
