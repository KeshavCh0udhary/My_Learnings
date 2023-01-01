package com.Question_3;

import java.security.Provider.Service;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws ExecutionException,InterruptedException{
     
		Product[] tasks = {
				
			new Product(3),
			new Product(4),
			new Product(5),
			new Product(6),
			new Product(7),
			new Product(8),	
			
		};
		
		ExecutorService ES = Executors.newFixedThreadPool(3);
		
		for(Product p : tasks) {
		
			Future NewF = ES.submit(p);
			
			System.out.println(NewF.get());
			
		}
		
		ES.shutdown();
	}

}
