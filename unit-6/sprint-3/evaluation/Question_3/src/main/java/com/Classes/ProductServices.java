package com.Classes;

import java.util.List;

import com.exception.ProductException;

public interface ProductServices {
	public boolean addProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(int productId)throws ProductException;
	public List<Product> getProductsBetweenPrice(int fromPrice, int toPrice)throws ProductException;

}
