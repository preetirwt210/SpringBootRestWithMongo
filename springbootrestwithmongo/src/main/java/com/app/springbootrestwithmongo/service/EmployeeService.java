package com.app.springbootrestwithmongo.service;

import java.util.List;

import com.app.springbootrestwithmongo.entity.Employee;

public interface EmployeeService {

	Employee save(Employee employee);
	
	Employee update(Employee employee);
	
	List<Employee> getAllEmployee();
	
	void deleteEmployee(String employeeId);
	
	Employee getEmployee(String employeeId);
	
}
