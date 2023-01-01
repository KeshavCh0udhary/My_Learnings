package com.OPPS;

public class Student {
    
	  int roll;
	  String name;
	  int marks;
	  
	 public void displayStudentDetails(){
	
		 System.out.println("Roll is : "+roll);
		 System.out.println("Name is : "+name);
		 System.out.println("Marks is : "+marks);
	 }
	 
	 public static void main (String[] args) {
		 
		 Student obj1=new Student();
			obj1.name="Krishna Keshav";
			
			obj1.roll=20;
			
			obj1.marks=450;
			
			obj1.displayStudentDetails();
			
			obj1=null;
			
			
			Student obj2=new Student();
			
	        obj2.name="Hemant";
			
			obj2.roll=10;
			
			obj2.marks=470;
			
			obj2.displayStudentDetails();
			
			obj2=null;
	 }
}
