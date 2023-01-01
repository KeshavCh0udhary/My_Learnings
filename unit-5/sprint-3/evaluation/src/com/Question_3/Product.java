package com.Question_3;

import java.util.concurrent.Callable;

public class Product implements Callable{

	long Num;
	
	public Product(int Num) {
		
		this.Num = Num;
		
	}
	
	@Override
	public Object call() throws Exception{
		
		long factorial = 1;
		
		int i=1;
		
		while(i<=Num)
		factorial *= i++;
		
		return factorial;
		
	}
	
}
