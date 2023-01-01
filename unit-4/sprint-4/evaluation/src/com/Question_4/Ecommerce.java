package com.Question_4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {

	List<Product> productList=new ArrayList<>();
	
	void addProductToList(Product product) {
		
		for(Product i : productList) {
			
			if(i.name.equals(product.name) && i.company.equals(product.company)) {
				i.count+=product.count;
				System.out.println("Count updated Product already exists");
				return;
			}
		}
		
		productList.add(product);
		System.out.println("Product added successfully");
	}
	
	List<Product>showAllProduct(){
		
		return productList;
		
	}
}
