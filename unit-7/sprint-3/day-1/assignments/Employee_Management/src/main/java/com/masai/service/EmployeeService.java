package com.masai.service;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;


public interface EmployeeService {
	
	public Employee createEmployee(Employee employee) throws EmployeeException;
	public Employee updateEmployee( Employee employee) throws EmployeeException;
	public String deleteEmployee(Integer id) throws EmployeeException;
	public Employee getEmployeeById(Integer id) throws EmployeeException;
}
