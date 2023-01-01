package com.OPPS;

public class Java {

	// Write a non-static method inside a java class that accepts a whole number and
	// prints the same
	// number if the input is Odd. If the input is even, it should print the next
	// multiple of ten. If the input is
	// negative, print the string: “Error”.Call this method from your main method
	// and observe the output.
	// Sample Output:
	// Input: 44, output: 50
	// Input: 45, output: 45
	// Input: -5, output: Error

	public void printNumbers(int args) {
		if (args < 0) {
			System.out.println("Error");
			return;
		}
		if (args % 2 == 1) {
			System.out.println(args);
			return;
		} else {
			if (args % 10 == 0) {
				args = 10 * ((args / 10) + 1);

			} else {
				args = args + (10 - (args % 10));

			}
			System.out.println(args);
			return;
		}

	}

	public static void main(String[] args) {
		Java Num = new Java();
		Num.printNumbers(232);
	}

}
