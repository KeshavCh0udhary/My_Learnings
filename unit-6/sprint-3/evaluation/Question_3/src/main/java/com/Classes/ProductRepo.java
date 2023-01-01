package com.Classes;

import java.util.List;

public interface ProductRepo {
	public boolean insertProductDetails(Product product);
	 public List<Product> getAllProductDetails();
	 public Product findProduct(int productId);
	 public List<Product> getProductInPriceRange(int fromPrice, int toPrice);

}
