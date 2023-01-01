package com.Q1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;



public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		List<Student> st = new ArrayList<>();
		st.add(new Student(10, "Nitin", 21, 101, 500));
		st.add(new Student(11, "Ajay", 22, 102, 700));

		List<Employee> em = new ArrayList<>();
		em.add(new Employee(10, "Rahul", 22, 22000, "sell", "Dehradun"));
		em.add(new Employee(11, "Nikku", 32, 10000, "Teaching", "Delhi"));

		List<PartTimeExmployee> pt = new ArrayList<>();
		pt.add(new PartTimeExmployee(5400, 124));
		pt.add(new PartTimeExmployee(6000, 4715));
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myObjects.sr"));
		//oos.writeObject(pt);
		oos.writeObject(st);
		oos.writeObject(em);
		oos.flush();
		oos.close();
		System.out.println("ok..");

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myObjects.sr"));
		Object ob = ois.readObject();
		Object ob1 = ois.readObject();
		List<Employee> emp = (List<Employee>) ob1;
		List<Student> st1 = (List<Student>) ob;
		List<Person> pr = (List<Person>) ob;

		emp.forEach(empl -> {
			System.out.println(empl);
		});
		pr.forEach(p -> {
			System.out.println(p);
		});
		st1.forEach(s -> {
			System.out.println("Id = " + s.getId());
			System.out.println("Age = " + s.getAge());
			System.out.println("Name = " + s.getName());
			System.out.println("Marks = " + s.getMarks());
			System.out.println("Roll = " + s.getRoll());
			System.out.println("=============================");
		});

	}
}
