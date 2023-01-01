package com.Question3;

import java.util.Scanner;

public class Course {
	
	int courseId;
	String courseName;
	int courseFee;
	
	public void displayCourseDetails(){
		
		System.out.println("Course Name : "+courseName);
		System.out.println("Course ID : "+courseId);
		System.out.println("Course Fee : "+courseFee);
		
		return;
		
	}
	
	
    public static void authenticate(String username ,String password){
    	 
    	if(username.equals("Admin") && password.equals("1234")) {
    		
    		Course courseDetails= new  Course();
    		
    		Scanner sc= new Scanner(System.in);
    		
    		System.out.println("Enter Course Name : ");
    		courseDetails.courseName=sc.nextLine();
    		
    		System.out.println("Enter CourseId : ");
    		courseDetails.courseId=sc.nextInt();
    		
    		System.out.println("Enter Course Fee : ");
    		courseDetails.courseFee=sc.nextInt();
    		
    		courseDetails.displayCourseDetails();
    		
    		return;
    		
    	} else System.out.println("Invalid Username or password");
    	
    	  return;
    	
    }
	

	public static void main(String[] args) {
		
		authenticate("Admin","1234");
		
		authenticate("Keshav","4321");

	}
    
	
	
}
