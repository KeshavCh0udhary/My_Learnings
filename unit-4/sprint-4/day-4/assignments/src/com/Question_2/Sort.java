package com.Question_2;

import java.util.Comparator;

public class Sort implements Comparator<Employee> {

	@Override
	public int compare(Employee a, Employee b) {
		
		return a.getSalary()>b.getSalary() ? 1 : a.getSalary()<b.getSalary() ? -1 : 0;
	
	}
	
}
