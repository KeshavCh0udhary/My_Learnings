package com.usecases;

import com.dao.EmployeeInterImpl;
import com.exceptions.EmployeeException;

public class DeleteEmploye {

	public static void main(String[] args) {
		
		EmployeeInterImpl eii = new EmployeeInterImpl();
		
		try {
			System.out.println(eii.deleteEmployeeById(3));
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
	
}
