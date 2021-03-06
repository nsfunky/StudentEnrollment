package com.opex.software.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
public class EmployeeLogin {

	@NotEmpty
	@Size(min=4, max=20)
	private String userName;
		
	@NotEmpty
	@Size(min=4, max=8)
	private String password;

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}	
}
