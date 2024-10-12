package com.learn.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.service.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String>{

}
