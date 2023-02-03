package com.crud.service;

import java.util.List;
import java.util.Optional;

import com.crud.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> findAll();
	
	public Optional<Employee> findById(int id);
	
	public Employee updateById(int id, Employee employee);
	
	public void deleteById(int id);
}
