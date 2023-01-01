package com.Question_4;

public class RohitThread extends Thread{
long pro=1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10; i++) {
			pro*=i;
		}
		System.out.println("Inside "+currentThread().getName()+" product is -"+pro);
	}
}