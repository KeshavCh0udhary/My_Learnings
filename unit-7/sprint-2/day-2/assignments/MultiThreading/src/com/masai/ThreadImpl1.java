package com.masai;

public class ThreadImpl1 extends Thread {

	@Override
	public void run() {
		for (int a=0;a<10000;a++) {
			System.out.print("inside the threadimple1"+a+" ");
		}
	}
	
}
