package com.opex.software.model;

import java.util.Date;

public interface EmployeeInterface {

	public Long getId();

	public void setId(Long id);

	public String getUserName();

	public void setUserName(String userName);

	public String getFirstName();

	public void setFirstName(String firstName);

	public String getLastName();

	public void setLastName(String lastName);

	public String getPassword();

	public void setPassword(String password);

	public String getEmailAddress();

	public void setEmailAddress(String emailAddress);

	public Date getDateOfBirth();

	public void setDateOfBirth(Date dateOfBirth);

}