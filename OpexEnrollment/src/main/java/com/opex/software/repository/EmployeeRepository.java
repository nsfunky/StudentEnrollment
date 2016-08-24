package com.opex.software.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.opex.software.model.EmployeeInterface;
import com.opex.software.model.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{
	
	@Query("select s from Employee s where s.userName = :userName")
	EmployeeInterface findByUserName(@Param("userName") String userName);
	
}
