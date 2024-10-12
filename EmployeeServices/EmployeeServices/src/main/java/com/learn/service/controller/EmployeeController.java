package com.learn.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.service.entities.Employee;
import com.learn.service.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	//create emp
	@PostMapping
	ResponseEntity<Employee> createEmp(@RequestBody Employee emp){
		return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmp(emp));
	}
	
	//get single emp
	@GetMapping("/{empId}")
	ResponseEntity<Employee> getSingleEmp(@PathVariable String empId){
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.getSingleEmp(empId));
	}
	
	//get all emp
	@GetMapping
	ResponseEntity<List<Employee>> getAllEmp(){
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmp());
	}

	
	
	
	
	
	
	
	
	
	
	
}