package com.Question_2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
 public static Period check(LocalDate d) {
	 Period p=null;
	 try {
	 LocalDate c1 = LocalDate.now();

	 if(d.isBefore(c1)) {
		  p = Period.between(d,c1);
		  return p;
	 }else {
		 System.out.println("Date should not be in Future");
	 }

	 }
	 catch(DateTimeParseException e){
			System.out.println("Please enter Date of bith in dd-MM-yyyy format");
			}
	 return p;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your date of birth in dd-MM-yyyy format");
		String dob = sc.next();
		LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		Period p1=null;
		 p1=check(d1);
		if(p1!=null) {
			System.out.println("Your age is "+p1);
		}
	}
}
