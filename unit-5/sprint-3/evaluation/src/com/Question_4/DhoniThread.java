package com.Question_4;

public class DhoniThread extends Thread{
   int sum=0;

    @Override
	public void run() {
		synchronized (this) {
			for(int i=1;i<=20; i++) {
				sum+=i;
			}
			System.out.println("Inside "+currentThread().getName()+" sum :-"+sum);
		}
		
	}
}
