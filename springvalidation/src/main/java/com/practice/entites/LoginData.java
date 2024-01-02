package com.practice.entites;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Pattern;





public class LoginData { 
	@NotBlank(message = "User Name can not be empty !!")
	
	@Size(min = 2 , max = 12, message = "User must be Between 3- 12 character!!")
	private String  userName;
	
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"
			, message = "Invaild Email !!" )
	private String email;
	
	@AssertTrue
	private boolean agreed;
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}
	
}
