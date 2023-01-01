package com.Question_4;

public class DemoThread extends Thread{

	@Override
	public void run() {
		synchronized (this) {
			for(int i=1;i<=10; i++) {
				System.out.println("Inside "+currentThread().getName()+"-"+i);
			}
			
		}	
	}
	
}
