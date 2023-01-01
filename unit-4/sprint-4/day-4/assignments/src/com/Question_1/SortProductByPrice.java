package com.Question_1;

import java.util.Comparator;

public class SortProductByPrice implements Comparator<Product>{

	@Override
	public int compare(Product a, Product b) {
		
		return  a.getProductPrice()>b.getProductPrice() ? 1 : a.getProductPrice()<b.getProductPrice() ? -1 : 0; 
	}

}
