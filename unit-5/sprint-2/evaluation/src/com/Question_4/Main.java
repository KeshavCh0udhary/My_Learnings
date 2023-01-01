package com.Question_4;
import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {

		List<String> Names = Arrays.asList("Krishna","Keshav","Rahul","Satyam","Raj","Ranjan","Gopal","Anand","Mukesh","Hemant");
		
		System.out.println("Old List..............");
		System.out.println(Names);
		
		Names.forEach((i) -> System.out.println(i));
		
		List<String> NewNames = Names.stream().filter((i) -> i.length()%2 == 0)
				     .map((i) -> i.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("New List of Even Length..............");
		System.out.println(NewNames);
		NewNames.sort((a,b) -> a.compareTo(b));
		
		NewNames.forEach((i) -> System.out.println(i));
	
	}

}
