package com.Question_1;

public class Main {
    
	
	
	public static void main(String[] args) {

		Bird bird = new Parrot();
		//with this b1 reference call the fly method of
		bird.fly();
		
		Parrot parrot=(Parrot)bird;
		parrot.sing();
	
	}

}
