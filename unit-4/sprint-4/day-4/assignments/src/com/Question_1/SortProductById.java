package com.Question_1;

import java.util.Comparator;

public class SortProductById implements Comparator<Product> {

	@Override
	public int compare(Product a, Product b) {

		return a.getProductId()>b.getProductId() ? 1 : a.getProductId()<b.getProductId() ? -1 : 0;

	}

}
