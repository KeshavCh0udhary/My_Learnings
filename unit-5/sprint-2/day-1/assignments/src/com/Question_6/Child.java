package com.Question_6;

public class Child extends Parent{

	Child() throws Exception {
		super();
	}
 
	public static void main(String[] args) {
		
		
		try {
			Parent pr = new Parent();
			pr.fun1();	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
