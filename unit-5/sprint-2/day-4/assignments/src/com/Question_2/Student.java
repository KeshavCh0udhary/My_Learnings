package com.Question_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Stream;


public class Student {

	int roll;
	String name;

	double marks;
	Student(){
		
	}
	public Student(int roll, String name,  double marks) {
		super();
		this.roll = roll;
		this.name = name;
		
		this.marks = marks;
	}
	


	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" +  ", marks=" + marks + "]";
	}
	public static void main(String[] args) {
	List<Student> s=Arrays.asList(
			new Student(1,"Keshav",700),
			new Student(2,"Krishna",500),
			new Student(3,"Satyam",800),
			new Student(4,"Saroj",900),
			new Student(5,"Rahul",600));
			
			Optional<Student> st=s.stream().max((o1,o2)->o1.marks>o2.marks?1:-1);
			System.out.println(st);

	}
}
