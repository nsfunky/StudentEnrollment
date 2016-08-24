package com.opex.software.client;

import javax.ws.rs.core.Response;

public interface EmployeeClientInterface {

	public Response getSignup();

	public Response postSignup(String userName, String password,
			String firstName, String lastName, String dateOfBirth,
			String emailAddress) throws Exception;

	public Response getLogin();

	public Response postLogin(String userName, String password);

}