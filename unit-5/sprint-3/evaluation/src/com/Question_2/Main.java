package com.Question_2;

public class Main {

	public static void main(String[] args) {

		Calculate C = new Calculate();
		
		C.start();
		
		synchronized(C) {
			try {
				
				System.out.println("Main thread is waiting");
				
				C.wait();
				
				System.out.println("Notified");
				
				C.notify();
				
			} catch (InterruptedException ex){
				
				ex.printStackTrace();
				
			}
		}
		
		System.out.println("Product of 1 to 10 is "+C.product);
		
	}

}
