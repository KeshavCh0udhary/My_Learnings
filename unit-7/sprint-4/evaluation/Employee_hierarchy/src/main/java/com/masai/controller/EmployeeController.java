package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeService es;
	
	@GetMapping("/api/get-employees/{employee-id}")
	public ResponseEntity<Employee> getEmployeeby(@PathVariable("employee-id") Integer employeeid) throws EmployeeException{
		return new ResponseEntity<Employee>(es.GetEmployee(employeeid),HttpStatus.OK);
		
	}
	
	@PostMapping("/api/add-employees")
	public ResponseEntity<Employee> registerEmployee(@RequestBody Employee emp) throws EmployeeException{
		return new ResponseEntity<Employee>(es.AddEmployee(emp),HttpStatus.CREATED);
	}
	
	@GetMapping("/api/get-manager/{employee-id}")
	public ResponseEntity<Employee> getManager(@PathVariable("employee-id") Integer employeeid) throws EmployeeException{
		return new ResponseEntity<Employee>(es.GetEmployeeManager(employeeid),HttpStatus.OK);
		
	}
	
	@GetMapping("/api/get-reportees/{employee-id}")
	public ResponseEntity<List<Employee>> getAllReportees(@PathVariable("employee-id") Integer employeeid) throws EmployeeException{
		return new ResponseEntity<List<Employee>>(es.getEmployeesReportees(employeeid),HttpStatus.OK);
		
	}
	
}
