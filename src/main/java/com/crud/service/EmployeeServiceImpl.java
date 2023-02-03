package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Employee;
import com.crud.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return this.employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		return this.employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> findById(int id) {
		return this.employeeRepository.findById(id);
	}

	@Override
	public Employee updateById(int id, Employee employee) {
		// TODO Auto-generated method stub
		Employee findById = this.employeeRepository.findById(id).get();
		findById.setName(employee.getName());
		findById.setDesignation(employee.getDesignation());
		findById.setAge(employee.getAge());
		return this.employeeRepository.save(findById);
	}

	@Override
	public void deleteById(int id) {
		this.employeeRepository.deleteById(id);
	}
}
