package com.miniProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		StudentService ss=new StudentServiceImplementation();
		
		Integer x;
		
		List<Student> students=new ArrayList<Student>();
		int take=1;
		while(true) {
			System.out.println(" Choose 1 to addStudent \n Choose 2 to deleteStudent \n Choose 3 to findbyid \n Choose 4 to findbpincode \n Choose 5 to Sort the list \n Choose 6 to get marks \n Choose 7 to add_and_;getallStudents");
			int choice =sc.nextInt();
			switch (choice) {
			case 1:
				Student stud =new Student();
				stud.setName("Krishna Keshav");
				stud.setSection("A");
				stud.setAddress(new Address("Ranchi","Jharkhand",832001));
				stud.setMarks(100);
				Student stud1=new Student();
				stud1.setName("O Kumar");
				stud1.setSection("A1");
				stud1.setAddress(new Address("Patna","Bihar",834001));
				stud1.setMarks(120);
				
				ss.addStudent(stud);
				ss.addStudent(stud1);
				students.add(stud);
				students.add(stud1);
				break;
			case 2:
				x=sc.nextInt();
			    ss.deleteStudent(x);
			    break;
			
			case 3:
				x=sc.nextInt();
				Student s=ss.findStudent(x);
				System.out.println(s);
				break;
				
			case 4:
				x=sc.nextInt();
				Student s1=ss.findStudentbyPincode(x);
				System.out.println(s1);
				break;
				
			case 5:
				List<Student> good=ss.sortStudent(students);
				for(Student n:good) {
					System.out.println(n);
				}
				break;
			case 6:
				List<Integer> marks=ss.Marks(students);
				System.out.println(marks);
				break;
			case 7:
				List<Student> f=new ArrayList<>();
				f.add(new Student(1,"Satyam",80,"a",new Address("Pune","Maharastra",412208)));
				List<Student> students2=ss.addAllStudent(f);
				for(Student z:students2) {
					System.out.println(z);
				}
				break;
			case 8:
				List<Student> p=ss.getAll();
				for(Student a:p) {
					System.out.println(a);
				}
				break;
			}
		}


    }
}
