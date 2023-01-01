package com.Question_2;

public class Calculate extends Thread{
    
	int product=1;
	
	@Override
	public void run() {
		
		synchronized(this) {
			int i=1;
			while(i<=10)
				product *= i++;
			
			this.notify();
		}
		
	}
	
}
