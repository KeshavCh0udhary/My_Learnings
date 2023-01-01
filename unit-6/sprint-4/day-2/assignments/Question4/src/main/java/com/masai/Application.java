package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.masai.classes.Demo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Application.class, args);
		
	}

}
