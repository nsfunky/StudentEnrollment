package com.opex.software.service;

import com.opex.software.model.EmployeeInterface;

public interface EmployeeService {
	EmployeeInterface save(EmployeeInterface employee);
	boolean findByLogin(String userName, String password);
	boolean findByUserName(String userName);
}
