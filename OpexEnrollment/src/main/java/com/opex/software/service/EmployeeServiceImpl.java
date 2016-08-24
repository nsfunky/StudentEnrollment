package com.opex.software.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.opex.software.model.Employee;
import com.opex.software.model.EmployeeInterface;
import com.opex.software.repository.EmployeeRepository;
import com.opex.software.service.EmployeeService;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Transactional
	public EmployeeInterface save(EmployeeInterface employee) {
		return employeeRepository.save((Employee)employee);
	}

	public boolean findByLogin(String userName, String password) {	
		EmployeeInterface emp = employeeRepository.findByUserName(userName);
		
		if(emp != null && emp.getPassword().equals(password)) {
			return true;
		} 
		
		return false;		
	}

	public boolean findByUserName(String userName) {
		EmployeeInterface stud = employeeRepository.findByUserName(userName);
		
		if(stud != null) {
			return true;
		}
		
		return false;
	}
}
