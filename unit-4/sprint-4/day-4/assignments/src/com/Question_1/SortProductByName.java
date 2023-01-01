package com.Question_1;

import java.util.Comparator;

public class SortProductByName implements Comparator<Product> {

	@Override
	public int compare(Product a, Product b) {
		
		return a.getProductName().compareTo(b.getProductName());

    }
}
