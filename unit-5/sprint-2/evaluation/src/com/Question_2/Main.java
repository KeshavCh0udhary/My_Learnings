package com.Question_2;
import java.util.function.*;
public class Main {

	public static void main(String[] args) {
		
		Predicate<Student> student = s -> s.getMarks() > 500;
		
		System.out.println(student.test(new Student(12,"Krishna Keshav",450)));
		
		Consumer<Student> C = i -> {
			
			System.out.println("Name "+i.getName());
			
			System.out.println("Roll "+i.getRoll());
			
			System.out.println("Marks "+i.getMarks());
			
		};
		
		C.accept(new Student(10,"Raj Ranjan",600));
		
		Supplier<Student> S = () -> new Student(4,"Satyam",400);
		
		System.out.println(S.get());
		
		Function<String, Integer> Fun = i -> {
			
			return Integer.parseInt(i);
			
		};
		
		System.out.println(Fun.apply("300"));
	}
	
}
