package com.presentationLayer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.configuration.AppConfig;
import com.serviceLayer.StudentService;

@Controller
public class Demo {

	public static void main(String[] args)
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		StudentService ss=ctx.getBean("studentService",StudentService.class);
		ss.printAppName();
		ss.printMap();
		ss.printList();
		
	}
	
	
}
