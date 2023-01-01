package com.Classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.ProductException;

@Service
public class ProductServiceImpl implements ProductServices {
	
	@Autowired
	private ProductRepo repo;

	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.insertProductDetails(product);
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.getAllProductDetails();
	}

	public Product getProductById(int productId) throws ProductException {
		// TODO Auto-generated method stub
		return repo.findProduct(productId);
	}

	public List<Product> getProductsBetweenPrice(int fromPrice, int toPrice) throws ProductException {
		// TODO Auto-generated method stub
		return repo.getProductInPriceRange(fromPrice, toPrice);
	}
	
	

}
