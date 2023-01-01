package com.masai;

public class Test {

	public static void main(String[] args) {
		
		Thread t1 = new ThreadImpl1();
		ThreadImpl2 t2 = new ThreadImpl2();
		
		
		t1.start();
		System.out.println();
		t2.run();
		
		
	}
	
	
}
