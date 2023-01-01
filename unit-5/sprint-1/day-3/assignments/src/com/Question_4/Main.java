package com.Question_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map<String, List<String>> m=new HashMap<>();
		m.put("West Bengal",Arrays.asList("Asansol","Kolkata","Bardmaan","santragchi") );
		m.put("Maharastra",Arrays.asList("Mumbai","Nagpur","Pune","Kalyan"));
		m.put("Bihar", Arrays.asList("Patna","Darbhanga","Samastipur","Madhubani"));
		m.put("Jharkhand", Arrays.asList("Ranchi","DeoGhar","Bokaro","Dhanbad"));
		Set<String> states= m.keySet();
		List<String> l=new ArrayList<>(states);
		Collections.sort(l);
		Collections.reverse(l);
		for(String s1:l) 
		for(Map.Entry<String, List<String>> m1:m.entrySet() ) {
			if(m1.getKey().equals(s1)) {
				 System.out.println("State- "+m1.getKey());
				 System.out.println("Cities of state");
				 List<String> list=new ArrayList<>(m1.getValue());
				 for(String c:list) {
					 System.out.println(c);
				 }
				 System.out.println("*******");
			}
        }
	}
}
