package com.Question_1;

import java.util.Scanner;

public class Main {
	
	
	public static String reversString(String input){
           
		char[] Char = input.toCharArray();
		int i=Char.length-1;
		
		String Str="";
		
		while(i>=0) {
			
			Str+= Char[i];			
			i--;
		}
		
		return Str;		
	}
			
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
		
	}
	
}