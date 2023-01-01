package com.Question_1;

public class Tiger extends Animal {
	  
	@Override
	void eat() throws AnimalException {
		super.eat();
		System.out.println("Tiger is eating!!");
	}
	
	public static void main(String[] args) {
		
		Animal an = new Tiger();
		
		try {
			an.eat();
		} catch (AnimalException e) {
			
			e.printStackTrace();
		}
		
	}
		
}
