package com.learn.service.service;

import java.util.List;

import com.learn.service.entities.Employee;

public interface EmployeeService {
		
	Employee createEmp(Employee emp);
	
	Employee getSingleEmp(String id);
	
	List<Employee> getAllEmp();
}
