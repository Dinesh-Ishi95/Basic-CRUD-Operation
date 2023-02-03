package com.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Employee;
import com.crud.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/emp")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return this.employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/emp")
	public List<Employee> getAllEmployee(){
		return this.employeeService.findAll();
	}
	
	@GetMapping("/emp/{id}")
	public Optional<Employee> getById(@PathVariable("id") Integer id){
		return this.employeeService.findById(id);
	}
	
	@PutMapping("/emp/{id}")
	public Employee updateEmployeeById(@PathVariable("id") Integer id, @RequestBody Employee employee) {
		return this.employeeService.updateById(id, employee);
	}
	
	@DeleteMapping("/emp/{id}")
	public String deleteById(@PathVariable("id") Integer id) {
		this.employeeService.deleteById(id);
		return "Deleted Successfully";
	}

}
