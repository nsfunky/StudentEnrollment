package com.opex.software.resource;

import java.text.ParseException;

import javax.ws.rs.core.Response;

public interface EmployeeResourceInterface {

	public Response signup();

	public Response signup(String userName, String password, String firstName,
			String lastName, String dateOfBirth, String emailAddress)
			throws ParseException;

	public Response login();

	public Response login(String userName, String password);

}