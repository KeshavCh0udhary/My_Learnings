package com.Question_2;

import java.util.Arrays;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
		
		List<String> listname = Arrays.asList("Mumbai","Pune","Ranchi","Banglore","HydraBaad");

		listname.sort((h2,h1) -> h1.compareTo(h2));
		
		System.out.println(listname);
		
	}
    
}
