package com.app.springbootrestwithmongo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.springbootrestwithmongo.dao.EmployeeDao;
import com.app.springbootrestwithmongo.entity.Employee;
import com.app.springbootrestwithmongo.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Employee save(Employee employee) {
		
		return employeeDao.save(employee);
	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public void deleteEmployee(String employeeId) {
		employeeDao.deleteById(employeeId);

	}

	@Override
	public Employee getEmployee(String employeeId) {
		
		return employeeDao.findById(employeeId).orElse(null);
	}

}
