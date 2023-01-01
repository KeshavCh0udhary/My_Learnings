package com.usecases;

import com.bean.Employee;
import com.dao.EmployeeInterImpl;
import com.exceptions.EmployeeException;

public class RegisterEmployee {

	public static void main(String[] args) {
		
		EmployeeInterImpl eii = new EmployeeInterImpl();
		
		Employee em  = new Employee();
		em.setName("n1");
		em.setAddress("delhi");
		em.setSalary(10000);
		
		try {
			System.out.println(eii.registerEmployee(em));
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	

	
	
	
}
