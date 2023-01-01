package com.masai.classes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Demo {
	
	@RequestMapping("/Employee")
	public Employee getEmployee() {
		return new Employee(1, "Abhishek Tomar", "Delhi");
		
	}
	@RequestMapping("/Employees")
	public List<Employee> getEmployees(){
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(1, "sujeet", "mumbai"));
		emp.add(new Employee(2, "aman", "navi"));
		emp.add(new Employee(3, "nitin", "dehradun"));
		emp.add(new Employee(4, "deepak", "delhi"));
		emp.add(new Employee(5, "vishesh", "punjab"));
		
		return emp;
		
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

}
