package com.Question_4;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		HashMap<String,Student> hm = new HashMap<>();
		
		hm.put("Bihar",new Student(1,"Krishna",430));
		hm.put("Maharastra",new Student(2,"Keshav",450));
		hm.put("Karnataka",new Student(3,"Sanjay",490));
		hm.put("WestBengal",new Student(4,"Akash",500));
		hm.put("Jharkhand",new Student(5,"Rahul",495));
			
			
		Collection<Student> cols = hm.values();
		
		List<Student> newStudent = new ArrayList<>(cols);
		
		Collections.sort(newStudent,new StudentMarksComp());
		
		for(Student S:newStudent)
		for(Map.Entry<String, Student> Sd : hm.entrySet()) 
	    if(Sd.getValue()==S) {
	    	
		   System.out.println("---------------------------");
		   System.out.println(Sd.getKey());
		   System.out.println("Name :"+S.getName());
		   System.out.println("Roll :"+S.getRoll());
		   System.out.println("Marks :"+S.getMarks());
		   System.out.println("****************************");
		   
		};
				
			
			
			
		
		
		
		
		
			
	}
}
