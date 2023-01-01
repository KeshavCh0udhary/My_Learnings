package com.Question_1;

import java.util.ArrayList;

public class Main {
	
	
	static void printList(ArrayList<String> args) {
		for(int i=0; i<args.size(); i++) {
			System.out.println(args.get(i));
		}
		
		for (String i: args) {
		     System.out.println(i);
		}
	}
	
	

	public static void main(String[] args) {

		ArrayList<String> Arr = new ArrayList<String>();
		
		Arr.add("Krishna");
		Arr.add("Keshav");
		Arr.add("Raj");
		Arr.add("Lion");
		
		printList(Arr);
		
		
	}

}
