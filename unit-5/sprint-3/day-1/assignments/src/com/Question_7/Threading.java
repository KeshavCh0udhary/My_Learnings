package com.Question_7;

public class Threading implements Runnable {

	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name +" is running"+" priority is "+Thread.currentThread().getPriority());
		}	
	}
	
	public static void main(String[] args) {
			
		Threading obj= new Threading();
		
		Thread obj1= new Thread(obj);
		Thread obj2= new Thread(obj);
		
		obj1.setPriority(8);
		obj2.setPriority(10);
		
		obj1.setName("Rohit Sharma");
		obj2.setName("MS Dhoni");
		
		
		obj1.start();
		obj2.start();
	}

}

