package com.masai;

public class ThreadImpl2 implements Runnable{

	@Override
	public void run() {
	for(int a=0;a<10000;a++) {
		System.out.print("inside threadimpl2 "+a+" ");
	}
		
	}

}
