package com.Question_2;

import java.util.Scanner;

public class Main {
	
	public static void calculateAverage(int[] age){
		
		float len=age.length;
		
		int i=0;
		float Sum=0;
		
		while(i<len) {
			Sum+=age[i];
			i++;
		}
		
		float Average = Sum/len;
		
		System.out.printf("%.2f",Average);
	}

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter total no.of employees: ");
		
		int numberOfEmployees= Sc.nextInt();
		
		if(numberOfEmployees<2) {
			System.out.println("Please enter a valid employee count");
			return;
		}
		
		int i=0;
		int[] ageArr= new int[numberOfEmployees];
		
		while(i<numberOfEmployees) {
			System.out.println("Enter the age for "+(i+1)+" employee: ");
			ageArr[i]=Sc.nextInt();
			i++;
		}
		calculateAverage(ageArr);

	}

}
