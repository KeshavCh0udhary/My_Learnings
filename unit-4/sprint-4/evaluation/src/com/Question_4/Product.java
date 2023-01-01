package com.Question_4;

public class Product {

	String name;
	double price;
	String company;
	int count;
	
	@Override
	public String toString() {
		return "Product {name=" + name + ", price=" + price + ", company=" + company + ", count=" + count + "}";
	}

	public Product(String name, double price, String company, int count) {
		super();
		this.name = name;
		this.price = price;
		this.company = company;
		this.count = count;
	}
	
	

	
}
