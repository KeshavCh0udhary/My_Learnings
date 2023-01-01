package com.Revision;

public class Dog extends Animal{
	
	private String breed;

	public Dog(String breed) {
		this.breed = breed;
	}

	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}
    
	public Dog() {
		super();
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Dog is making noise");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog is eating");
	}
	
	public void play() {
		System.out.println("Dog is playing");
	}
	

}
