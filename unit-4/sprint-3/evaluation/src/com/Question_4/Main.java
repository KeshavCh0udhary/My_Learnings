package com.Question_4;

import java.util.Scanner;

public class Main {
	
	public char characterAtTheGivenIndex(String args,int i) {
		
		char[] NewChar=args.toCharArray();
		
		int j=0;
		while (j<NewChar.length){
			if(i==j){
				return NewChar[j];
			}
			j++;
		}
		return '1';
		
	}

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String =>");
		String Str= sc.nextLine();
		
		System.out.println("Enter a position =>");
		int Pos= sc.nextInt();
		
		Main NewObj= new Main();
		
		int i=1;
		
		while(i>0) {
			if(Pos<Str.length()) {
				System.out.println("Character at the position "+ Pos+" => "+ NewObj.characterAtTheGivenIndex(Str, Pos));
				break;
			}else{
				System.out.println("Invalid position, Please enter a valid position =>");
				
			}
			Pos= sc.nextInt();
			i++;
		}
		
		
	}
	
	

}
