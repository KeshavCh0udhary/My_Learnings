package com.Question_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
public static void main(String[] args) {
	List<Product> products=new ArrayList<>();
	products.add(new Product(1,"Nike",12000,21));
	products.add(new Product(2,"Puma",15000,3));
	products.add(new Product(3,"Addidas",12500,42));
	products.add(new Product(4,"NikeJordan",129900,12));
	products.add(new Product(5,"Flying Machine",15000,9));
	Stream<Product> ps = products.stream().filter(p->p.getQuantity()>10);
	Stream <Product> p=ps.sorted((o1,o2)->o1.getPrice()>o2.getPrice()?1:-1);
	
	System.out.println(p.collect(Collectors.toList()));
}
}
