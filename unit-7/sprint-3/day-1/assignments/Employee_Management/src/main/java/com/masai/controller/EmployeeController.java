package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService eservice;
	
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> createEmployeeHandler(@RequestBody Employee employee) throws EmployeeException{
		Employee em= eservice.createEmployee(employee);
		return new ResponseEntity<Employee>(em,HttpStatus.CREATED);
	}
	
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateEmployeeHandler(@RequestBody Employee employee) throws EmployeeException{
		Employee em= eservice.updateEmployee(employee);
		return new ResponseEntity<Employee>(em, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeByIdHandler(@PathVariable Integer id) throws EmployeeException{
		Employee em = eservice.getEmployeeById(id);
		
		return new ResponseEntity<Employee>(em,HttpStatus.OK);
	}
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<String> deleteEmployeeByIdHandler(@PathVariable Integer id) throws EmployeeException{
		String str= eservice.deleteEmployee(id);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
}
