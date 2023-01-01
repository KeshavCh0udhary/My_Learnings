package com.masai.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public interface EmployeeService {
  
	
	public Employee AddEmployee(Employee employee);
	public Employee GetEmployee(Integer id) throws EmployeeException;
	public Employee GetEmployeeManager(Integer id) throws EmployeeException;
	public List<Employee> getEmployeesReportees(Integer ManagerId)throws EmployeeException;
	
	
}
