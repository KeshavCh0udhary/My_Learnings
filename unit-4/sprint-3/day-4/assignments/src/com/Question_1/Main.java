package com.Question_1;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Write logic to get numberOfPassenger and numberOfKms
		System.out.println("Enter Number Of Passenger");
		int numberOfPassenger = scanner.nextInt();
		
		System.out.println("Enter Number of Kilo Meters You Want to Travel");
		int numberOfKms = scanner.nextInt();
		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(numberOfPassenger,numberOfKms);
		int res = myOla.calculateBill(myCar);
		System.out.println("The total fare amount is "+ res);
	}
}
