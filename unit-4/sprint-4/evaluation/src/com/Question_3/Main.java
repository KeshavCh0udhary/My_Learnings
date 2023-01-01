package com.Question_3;

import java.util.TreeSet;
public class Main {

	public static void main(String[] args) {

		
		TreeSet<Student> NewStudent= new TreeSet<> ( new Compare());
			
		NewStudent.add(new Student (12, "Krishna", 30,40,50));
		NewStudent.add(new Student (18, "Keshav",  20,50,100));
		NewStudent.add(new Student (21, "Raushan",  45,58,74));
		NewStudent.add(new Student (55, "Rahul",  64,88,80));
		
		 for(Student a: NewStudent) {
			 
			System.out.println(a);
         }
		
	}
}
