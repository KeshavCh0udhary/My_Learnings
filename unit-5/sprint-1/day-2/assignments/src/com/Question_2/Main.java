package com.Question_2;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		TreeMap<Student,String> tm = new TreeMap<>(new StudentMarksComp());
		
			tm.put(new Student(1,"Krishna",500),"Bihar");
			tm.put(new Student(2,"Keshav",450),"Maharastra");
			tm.put(new Student(3,"Sanjay",490),"Karnataka");
			tm.put(new Student(4,"Akash",430),"WestBengal");
			tm.put(new Student(5,"Rahul",495),"Jharkhand");
			
		Set<Map.Entry<Student,String>> set= tm.entrySet();
		
		for(Map.Entry<Student,String> S: set) {
			
			System.out.println("---------------------------");
			System.out.println("Topper Student of the State : " + S.getValue());
			
			Student student = S.getKey();
			System.out.println("Roll :" + student.getRoll());
			System.out.println("Name :" + student.getName());
			System.out.println("Marks :" + student.getMarks());
			
			System.out.println("****************************");
		}

	}

}
