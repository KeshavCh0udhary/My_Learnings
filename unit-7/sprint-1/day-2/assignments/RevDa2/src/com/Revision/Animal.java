package com.Revision;

public abstract class Animal {
    
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public Animal() {
		super();
	}
	
	public abstract void makeNoise();
		
	public abstract void eat();
	
	public void sleep() {
		
		System.out.println("Animal is sleeping");
		
	}
	
}
