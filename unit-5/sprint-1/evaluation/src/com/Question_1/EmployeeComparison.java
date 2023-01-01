package com.Question_1;

import java.util.Comparator;

public class EmployeeComparison implements Comparator <Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getSalary()>e2.getSalary() ? -1: +1;
	}

}
