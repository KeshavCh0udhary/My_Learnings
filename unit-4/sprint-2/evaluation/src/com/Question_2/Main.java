package com.Question_2;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Student stu=new Student();
		int noOfStu;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of Students you want to enter");
		noOfStu=sc.nextInt();
		
		for(int i=0;i<noOfStu;i++) {
			System.out.println("Enter the Roll Number :");
			int x=sc.nextInt();
			stu.setRollNumber(x);
			
			System.out.println("Enter the Name :");
			String y=sc.next();
			stu.setStudentName(y);
			
			System.out.println("Enter the marks :");
			int z=sc.nextInt();
			stu.setMarks(z);
			if((i+1)<10) {
				System.out.println("Student Detail "+"0"+ (i+1));
			}else {
				System.out.println("Student Detail "+ (i+1));
			}
			
			System.out.println("Student Roll Number: "+stu.getRollNumber());
			System.out.println("Student Name: "+stu.getStudentName());
			System.out.println("Student Mark: "+stu.getMarks()+".0");
			
			System.out.println("=======================================");
		}
		
		
	}

}