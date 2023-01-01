package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	Collage st = 	apc.getBean("clg",Collage.class);
		
	System.out.println(st);
	st.showDetails();
		
		
		
	}
	
	
	
}
