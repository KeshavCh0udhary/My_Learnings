package com.masai.controller;
import java.util.List;

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

import com.masai.Exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.service.EmployeeService;

@RestController
public class MyController {

	@Autowired
	public EmployeeService employeeservice;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> regidterEmployeeHandler(@RequestBody Employee emp) throws EmployeeException{
	Employee empl= employeeservice.registerEmployee(emp);
		
		return new ResponseEntity<Employee>(empl,HttpStatus.OK);
		
	}
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<Employee> getEmployeeByIdHandler(@PathVariable("empId") Integer empId) throws EmployeeException{
		
		Employee empl = employeeservice.getEmployeeById(empId);
		return new ResponseEntity<Employee>(empl,HttpStatus.OK);
		
	}
	

		@GetMapping("/employees")
		public ResponseEntity<List<Employee>> getAllEmployeeDetailshnadler() throws EmployeeException{
			
			List<Employee> empl = employeeservice.getAllEmployeeDetails();
			
			return new ResponseEntity<List<Employee>>(empl,HttpStatus.OK);
			
			
		}
		@DeleteMapping("/delEmployee/{empId}")
		public ResponseEntity<Employee> deleteEmployeeByIdHandler(@PathVariable("empId") Integer empId) throws EmployeeException{
			
			Employee empl = employeeservice.deleteEmployeeById(empId);
			
			return new ResponseEntity<Employee>(empl,HttpStatus.OK);
			
		}
		@PutMapping("/updateEmployee")
		public ResponseEntity<Employee> updateEmployeeHandler(@RequestBody Employee emp) throws EmployeeException{
			
			Employee empl = employeeservice.updateEmployee(emp);
			
			return new ResponseEntity<Employee>(empl,HttpStatus.OK);
		}
		
		public ResponseEntity<String>  getNameAndAddressOfEmplyeeById(@PathVariable("roll") Integer roll) throws EmployeeException{

			String name= employeeservice.getNameAndAddressOfEmplyeeById(roll);
			
			return new ResponseEntity<String>(name, HttpStatus.OK);
			
		}
}
