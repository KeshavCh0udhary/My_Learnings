package com.Question_3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Student> S = new ArrayList<>();
		
		S.add(new Student(1,"Raj",500,"Ranchi"));
		S.add(new Student(3,"Raj Ranjan",550,"Patna"));
		S.add(new Student(6,"keshav",400,"Pune"));
		S.add(new Student(2,"Krishna",700,"Mumbai"));
		S.add(new Student(9,"Satyam",900,"Delhi"));
		
		//S.stream().filter(s -> s.getMarks() >= 500).forEach(s -> System.out.println(s));
		
	    List<Employee> E = S.stream().filter((st) -> st.getMarks() > 500)
	    		.map((Emp) -> new Employee(Emp.getRoll(),Emp.getName(),Emp.getMarks()*10000,Emp.getAddress()))
	    		.collect(Collectors.toList());
	    
	    E.forEach((i) -> System.out.println(i));
	    		
	    
	    
		
	}

}
