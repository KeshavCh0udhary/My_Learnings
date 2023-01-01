package com.Question_1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter an Integer :");
			String input = sc.nextLine();

			int num = Integer.parseInt(input);

			System.out.println("the square value is:" + num * num);
		}

		catch (NumberFormatException nfe) {
			System.out.println("Entered input is not a valid format for an integer.");

		}

		System.out.println("The work has been has done succesfully");
	}

}
