package com.learn.service.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.service.entities.Employee;
import com.learn.service.exception.ResourceNotFound;
import com.learn.service.repositories.EmployeeRepository;
import com.learn.service.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public Employee createEmp(Employee emp) {
		String empId = UUID.randomUUID().toString();
		emp.setEmpId(empId);
		return repository.save(emp);
	}

	@Override
	public Employee getSingleEmp(String empId) {
		return repository.findById(empId).orElseThrow(()-> new ResourceNotFound("Resource not found for id-"+empId));
	}

	@Override
	public List<Employee> getAllEmp() {
		return repository.findAll();
	}

}
