package com.Question_5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args)throws Exception,Exception {
		
		List<Student> student = new ArrayList<>();
		
		student.add(new Student(1,"Keshav",250,"keshav@gmail.com","K@123#",new Address("Bihar","Patna","8834"))) ;
		student.add(new Student(2,"Krishna",250,"krishna@gmail.com","s@123#",new Address("Jharkhand","ranchi","2345"))) ;
		student.add(new Student(3,"Satyam",250,"satyam@gmail.com","r@123#",new Address("Maharastra","mumbai","64e322"))) ;
		student.add(new Student(4,"Rahul",250,"rahul@gmail.com","a@123#",new Address("Gujrat","gandginagar","4635"))) ;
		student.add(new Student(5,"Saroj",250,"saroj@gmail.com","b@123#",new Address("Delhi","del","856834"))) ;
		
        ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
		
		ob.writeObject(student);
		ob.close();
	}
	
}
