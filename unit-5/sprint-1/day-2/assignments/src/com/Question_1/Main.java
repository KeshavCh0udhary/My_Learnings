package com.Question_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static List<? super Integer> genericMethod(List<? super Integer> list) {
	
	    return list; 
	    
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		List<Integer> NewList = new ArrayList<>();
		
		int i = 5;
		
		while(i>0) {
			
			System.out.println("Enter Integer value or its parent class for "+ i-- +" times");
			NewList.add(sc.nextInt());
			
		}
		
		System.out.println(genericMethod(NewList));
		
	}

}
