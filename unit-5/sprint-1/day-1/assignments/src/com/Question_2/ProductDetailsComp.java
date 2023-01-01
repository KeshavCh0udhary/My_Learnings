package com.Question_2;

import java.util.Comparator;

public class ProductDetailsComp implements Comparator<Product>{

	@Override
	public int compare(Product P1, Product P2) {
		
		return (int)P1.getProductPrice() > (int) P2.getProductPrice() ? -1 : 1;
		
	}

}
