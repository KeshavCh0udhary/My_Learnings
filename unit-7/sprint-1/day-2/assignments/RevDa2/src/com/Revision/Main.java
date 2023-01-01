package com.Revision;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Animal Cat = new Cat();
		Animal Dog = new Dog();
		
		Cat.eat();
		Cat.makeNoise();
		Cat.sleep();
		Cat NewCat = (Cat)Cat;
		NewCat.jump();
		
		System.out.println("---------------");
		
		Dog.eat();
		Dog.makeNoise();
		Dog.sleep();
		Dog NewDog = (Dog)Dog;
		NewDog.play();
	}

}
