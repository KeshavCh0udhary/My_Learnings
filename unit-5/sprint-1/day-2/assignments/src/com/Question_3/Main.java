package com.Question_3;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		LinkedHashMap<String,String> hm=new LinkedHashMap<>();
		hm.put("Maharastra","Mumbai");
		hm.put("Karnataka","Bangalore");
		hm.put("Bihar","Patna");
		hm.put("Jharkhand","Ranchi");
		hm.put("Odisha","Bhubneshwar");
		
		for(Map.Entry<String,String> me:hm.entrySet()){
		    System.out.println("The Capital of "+me.getKey()+" is "+me.getValue());
		}
	}
}
