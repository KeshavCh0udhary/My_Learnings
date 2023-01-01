package com.Question_1;

import java.util.*;
import java.util.Map.Entry;

public class Demo {

	public static void main(String[] args) {
		
		TreeMap<Employee, String> tr= new TreeMap<>(new EmployeeComparison());
		
		tr.put(new Employee(4,"Sanjay",6599),"A1");
		tr.put(new Employee(5,"Sursj",6700),"A5");
		tr.put(new Employee(2,"Rahul",6362),"A3");
		tr.put(new Employee(7,"Satysm",7099),"A2");
		tr.put(new Employee(1,"Shekhar",6199),"A7");
	
	
	for(Entry<Employee, String> ent:tr.entrySet()) {
		System.out.println(ent.getKey()+"--"+ ent.getValue());
	}

 }

	
}
