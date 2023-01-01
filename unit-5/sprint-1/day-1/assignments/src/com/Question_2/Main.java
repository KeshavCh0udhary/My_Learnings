package com.Question_2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main extends Product{

	public static void main(String[] args) {

		PriorityQueue<Product> pq = new PriorityQueue<Product>(new ProductDetailsComp());
		
		
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		
		while(i<5) {
			
			Product newProduct = new Product();
			
			System.out.println("Enter Product Id");
			newProduct.setProductId(sc.nextInt());
			
			System.out.println("Enter Product Price");
			
			newProduct.setProductPrice(sc.nextInt());
			
			sc.nextLine();
			System.out.println("Enter Product Name");
			newProduct.setProductName(sc.nextLine());
			
			pq.add(newProduct);
			
	        i++;
	        
		}
		
		
		Product P = null;
		
		while((P = pq.poll()) != null) {
			
			 System.out.println(P.toString());
			
		}
				
	}

}
