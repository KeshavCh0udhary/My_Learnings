package com.Question2;

import java.util.Scanner;

//Write a Java program to get the character at the given index within the String.Take 
//the input with the help of Scanner class

public class PrintIndexOfCharecter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");

		String Str = sc.nextLine().trim();

		System.out.println("Enter the character position you want to access: ");

		int Position = sc.nextInt();

		char[] charArr = Str.toCharArray();

		if (Position < 0 && Position > charArr.length - 1) {

			System.out.println("Please Enter Valid Position");
			return;

		}

		char x = charArr[Position];

		System.out.println("Character at position " + Position + " is : ");
		System.out.println(x);

		return;

	}

}
