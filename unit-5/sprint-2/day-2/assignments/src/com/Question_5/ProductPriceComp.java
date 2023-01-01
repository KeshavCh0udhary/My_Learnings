package com.Question_5;

import java.util.Comparator;

public class ProductPriceComp implements Comparator<Product> {

	@Override
	public int compare(Product p, Product p1) {
		return p.getPrice() > p1.getPrice() ? 1 : -1;
	}

}

