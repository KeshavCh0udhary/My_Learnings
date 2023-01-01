package com.dao;

import com.bean.Employee;
import com.exceptions.EmployeeException;

public interface EmployeeInter {

	
	public Employee registerEmployee(Employee employee)throws EmployeeException;
	
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public Employee deleteEmployeeById(int empId) throws EmployeeException;
	public Employee updateEmployee(Employee employee)throws EmployeeException;
}
