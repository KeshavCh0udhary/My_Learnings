package com.Question_5;

import java.util.Scanner;

public  class UserRegistration {

	public static void registerUser(String userName,String userCountry) throws InvalidCountryException{
		
		if(userCountry.equalsIgnoreCase("India")) {
			System.out.println("User registration done successfully");
		}else {
			 
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	try {
		System.out.println("Enter the userName:");
		String uname = sc.nextLine();
		
		System.out.println("Enter the user country");
		String ucountry  = sc.nextLine();
		
		registerUser(uname, ucountry);
		
	} 
	catch (InvalidCountryException ice) {
		System.out.println(ice.getMessage());
	
	   }
	
	System.out.println("Thank you !");
	
	
	}
	
}

