package com.Question_3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Student {

	
	int roll;
	String name;
	String email;
	int marks;
 
	 public Student(int roll, String name, String email, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}
	 public Student() {
		 
	 }

	public Map<String, Student> sortMapUsingStudentName(Map<String, Student>
	 originalMap){
		Map<String,Student> map=originalMap.entrySet()
                .stream()
                .sorted((i1, i2)
                            -> i1.getKey().compareTo(
                                i2.getKey()))
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (e1, e2) -> e1, LinkedHashMap::new));
		return originalMap;
		 
	 }
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student> map=new HashMap<>();
		map.put("Mumbai",new Student(24,"Keshav","k@gmail.com",495));
		map.put("Pune",new Student(3,"Krishna","kr@gmail.com",485));
		map.put("Ranchi",new Student(14,"Satyam","s@gmail.com",445));
		map.put("Patna",new Student(24,"Rahul","r@gmail.com",475));
		map.put("Darbhanga",new Student(34,"Saroj","saroj@gmail.com",500));
		Student obj=new Student();
		obj.sortMapUsingStudentName(map);
	      for (Entry<String, Student> entry :map.entrySet()) {
	            System.out.println("Key = " + entry.getKey()
	                               + ", Value = "
	                               + entry.getValue());

	}
	}

}

