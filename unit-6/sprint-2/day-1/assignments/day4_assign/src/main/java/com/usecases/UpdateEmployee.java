package com.usecases;

import com.bean.Employee;
import com.dao.EmployeeInterImpl;
import com.exceptions.EmployeeException;

public class UpdateEmployee {

	public static void main(String[] args) {
		
		EmployeeInterImpl eii = new EmployeeInterImpl();
		
		Employee emp = new Employee(8, "baman", "agra", 9000000);
		
		try {
			System.out.println(eii.updateEmployee(emp));
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
	}
	
	
}
