package com.Question_2;

import java.util.*;

public class Mobile {

	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();

	public  String addMobile(String company, String model) {
		
		ArrayList<String> NewList = new ArrayList<>();
		company=company.toLowerCase();
		
		String Message = "";
		
		if(mobiles.containsKey(company)) {
			ArrayList<String> X= mobiles.get(company);
			X.add(model);
			Message="Model added successfully";
			 System.out.println(Message);
			
		}else {
			
			NewList.add(model);
			mobiles.put(company,NewList);
			Message="Mobile added successfully";
			System.out.println(Message);
		}
		
		return Message;
		
	}
	
	public  List<String> getModels(String company) {
		
		company=company.toLowerCase();
		
		if(mobiles.containsKey(company))
			return mobiles.get(company);
		
		
		List<String> x = new ArrayList();
		
		return x;
		
		
	}
	
	public static void main(String[] args) {
		
		Mobile Mob = new Mobile();
		
		Mob.addMobile("Apple","11 Pro");
		Mob.addMobile("Apple","x");
		Mob.addMobile("Sony","11 Pro");
		
		Mob.addMobile("Vivo","11 Pro");
		Mob.addMobile("Apple","12 Pro");
		
		List<String> x = Mob.getModels("Apple");
		
		if(x.size()!=0)
	      System.out.println(x);
		else System.out.println("Invalid Company Supplied.");
		
	}
	
}
