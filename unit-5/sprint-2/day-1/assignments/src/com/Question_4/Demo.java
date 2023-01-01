package com.Question_4;

import java.util.Scanner;

public class Demo {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two space seprated number :");
		String input = sc.nextLine();
		
		input=input.trim();
		
		
		int num = Integer.parseInt(input);
		System.out.println(num);
		System.out.println(input.charAt(0));
		System.out.println(input.charAt(2));
		
	}

}

