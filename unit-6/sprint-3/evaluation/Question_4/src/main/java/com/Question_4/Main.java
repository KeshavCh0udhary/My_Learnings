package com.Question_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Shapes cr = ctx.getBean(Circle.class,"cr");
		cr.draw();
		Shapes tr = ctx.getBean(Triangle.class,"tr");
		tr.draw();
		Shapes cy = ctx.getBean(Cylinder.class,"cy");
		cy.draw();
	}
}
