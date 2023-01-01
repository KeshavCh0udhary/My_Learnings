package com.Question_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

	
	public static void main(String[] args) {
		
		
		List<Product> plist = Arrays.asList(
				
				new Product(1, "p1", 5, 400),
				new Product(3, "p3", 10, 800),
				new Product(4, "p4", 15, 100),
				new Product(5, "p5", 13, 600),
				new Product(6, "p6", 30, 700)
				);
		
		//System.out.println(plist);
		
		Collections.sort(plist,(p,p1) -> p.getPrice() < p1.getPrice() ? +1 : -1 );
		
		///System.out.println(plist);
		
		for(Product p : plist) {
			System.out.println("product id is :-->"+" "+p.getProductid());
			System.out.println("product name is :-->"+" "+p.getProductName());
			System.out.println("product quantity is--> :"+" "+p.getQuantity());
			System.out.println("product price :-->"+" "+p.getPrice());
			System.out.println("--------------------");
		}
		
	}
	
}