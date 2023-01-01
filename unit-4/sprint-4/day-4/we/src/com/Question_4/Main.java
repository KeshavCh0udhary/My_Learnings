package com.Question_4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	    Scanner sc =new Scanner(System.in);
		System.out.println("Enter start date  in dd-MM-yyyy format");
		String dob1 = sc.next();
		System.out.println("Enter End date  in dd-MM-yyyy format");
		String dob2=sc.next();
		try{
			LocalDate d1 = LocalDate.parse(dob1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate d2 = LocalDate.parse(dob2, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
			if((d1.isAfter(d2))){
			   System.out.println("Start date should be smaller than End date");
			}
			
		}catch (Exception e){
			  System.out.println("Please enter date in dd-MM-yyyy");
		}
		sc.close();
	}

}
