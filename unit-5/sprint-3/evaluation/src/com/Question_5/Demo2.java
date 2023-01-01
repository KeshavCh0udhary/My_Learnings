package com.Question_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) throws Exception, Exception {
		ObjectInputStream ios=new ObjectInputStream(new FileInputStream("studentdata.txt"));
		List<Student> li=(List)ios.readObject();
		
		for(Student s:li) {
			System.out.println(s);
		}
		
		li.add(new Student(22,"Ram",700,"ram@asdf","han999",new Address("Pra","UP","123654")));
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
		oos.writeObject(li);
		
		ObjectInputStream io=new ObjectInputStream(new FileInputStream("studentdata.txt"));
		List<Student> liNew=(List)io.readObject();
		
		for(Student s:liNew) {
			System.out.println(s);
		}
		
	}
	
	
}