package com.Question_5;

public interface Vehicle {

	public void run();
	
	public default void service() {
		System.out.println("Car needs service");
	}
	
}
