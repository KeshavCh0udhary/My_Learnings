package com.usecases;

import com.dao.EmployeeInterImpl;
import com.exceptions.EmployeeException;

public class FindEmployee {

	public static void main(String[] args) {
		
		EmployeeInterImpl aii = new EmployeeInterImpl();
		
		try {
			System.out.println(aii.getEmployeeById(3));
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
	
	
}
