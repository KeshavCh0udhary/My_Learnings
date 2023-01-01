package com.Question_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Product> NewProduct = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<4;i++) {

			System.out.println("Give product id");
			int ProductId = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Give product Name");
			String ProductName=sc.nextLine();
			
			System.out.println("Give Product price");
			double ProductPrice=sc.nextDouble();
			
			Product Pro = new Product(ProductId,ProductName,ProductPrice);
			NewProduct.add(Pro);
			
	    }	
		
		boolean Flag = true;
		
		while(Flag) {
			
			System.out.println("○ 1 for sorting the product according to the productPrice");
		    System.out.println("○ 2 for sorting the product according to the productName");
		    System.out.println("○ 3 for sorting the product according to the productId");
		    
		    
		    int Case=sc.nextInt();
			
			switch(Case) {

			    case 1 : 
		        
			    	Collections.sort(NewProduct,new SortProductByPrice());
					for(Product i:NewProduct) {
						System.out.println("productid "+i.getProductId());
						System.out.println("productName "+i.getProductName());
						System.out.println("ProductPrice "+i.getProductPrice());
						System.out.println("----------------------------------");
					}
					break;
			    
			    case 2 :
			    	
			       Collections.sort(NewProduct,new SortProductByName());
			 	   for(Product i:NewProduct) {
			 			System.out.println("productid "+i.getProductId());
			 			System.out.println("productName "+i.getProductName());
			 			System.out.println("ProductPrice "+i.getProductPrice());
			 			System.out.println("----------------------------------");
			 	   }
			 	   break;
			 	   
					
	            case 3 : 
			    	
			    	Collections.sort(NewProduct,new SortProductById());
					for(Product i:NewProduct) {
						System.out.println("productid "+i.getProductId());
						System.out.println("productName "+i.getProductName());
						System.out.println("ProductPrice "+i.getProductPrice());
						System.out.println("----------------------------------");
					}
					break;
					
				default :
					
					Collections.sort(NewProduct,new SortProductById());
					for(Product i:NewProduct) {
						System.out.println("productid "+i.getProductId());
						System.out.println("productName "+i.getProductName());
						System.out.println("ProductPrice "+i.getProductPrice());
						System.out.println("----------------------------------");
					}	
						
			}
			
			if(Case>3 || Case <1) Flag=false;
			
		}
		
			
	    
		

}
}
