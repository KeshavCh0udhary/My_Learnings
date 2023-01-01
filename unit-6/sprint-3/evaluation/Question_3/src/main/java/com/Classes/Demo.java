package com.Classes;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.exception.ProductException;
import com.masai.utility.EMUtil;


@Controller
public class Demo {
	
	@Autowired
	private ProductServices ps;
	
	public void insertProduct() {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Product Name ");
		String name= sc.next();
	
		System.out.println("Enter Quantity of product  ");
		int quan= sc.nextInt();
		
		System.out.println("Enter price of product  ");
		int price= sc.nextInt();
	
		
		Product p= new Product();
		p.setProductName(name);
		p.setQuantity(quan);
		p.setPrice(price);
		
		
	 	 if(ps.addProduct(p)) System.out.println("Record inserted");
		
	 	 else System.out.println("try again!!");
	
	}
	
	public void findbyid() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter productId");
		int id=sc.nextInt();
		try {
			Product p=ps.getProductById(id);
			System.out.println(p);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid id try again!!");
		}
	}
	
	public void getProducts() {
		
		List<Product> psl=ps.getAllProducts();
		psl.forEach(e -> System.out.println(e));
		
	}
	
	public void getfromRange() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Initial price");
		int x=sc.nextInt();
		System.out.println("last price");
		int y=sc.nextInt();
		
		
		try {
			List<Product> psl=ps.getProductsBetweenPrice(x, y);
			psl.forEach(e -> System.out.println(e));
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Demo d=ctx.getBean(Demo.class);
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Choose your option");
		
		while(true) {
			
			System.out.println("1.Add a product");
			System.out.println("2.Get all product");
			System.out.println("3.Find product by id");
			System.out.println("4.Find product Beetween in a price range");
			System.out.println("5.Exit");
			
			int choice=sc.nextInt();
			
			if(choice==1)d.insertProduct();
			else if(choice==2)d.getProducts();
			else if(choice==3)d.findbyid();
			else if(choice==4)d.getfromRange();
			else if(choice==5)break;
			else System.out.println(("Invalid choice"));
			
		}
		
	}
	
}
