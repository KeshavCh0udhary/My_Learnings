package com.Question_4;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;



public class Student {

	int roll;
	String name;
String email;
	double marks;
	Student(){
		
	}
	public Student(int roll, String name, String email, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.email=email;
		this.marks = marks;
	}
	


	

	@Override
	public int hashCode() {
		return this.roll;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(email, other.email)
				&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name) && roll == other.roll;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" +  ", marks=" + marks + "]";
	}
	public static void main(String[] args) {
		HashSet<Student> st=new HashSet<>();
		st.add( new Student(1,"Keshav","keshav@gmail.com",800));
		st.add( new Student(1,"Satyam","satyam@gmail.com",900));
		st.add( new Student(2,"Krishna","krishna@gmail.com",600));
		st.add( new Student(1,"Saroj","saroj@gmail.com",850));
		st.add( new Student(3,"Rahul","rahul@gmail.com",750));
		st.add( new Student(4,"Akash","akash@gmail.com",950));
		st.add( new Student(4,"Raj","raj@gmail.com",475));
		st.add(new Student(5,"Ranjan","ranjan@gmail.com",455));
		st.add(new Student(5,"Anand","anand@gmail.com",499));
		Set<Student> s=st.stream().filter(x-> x.marks<500).collect(Collectors.toSet());
		System.out.println(s);
		
	}
	
}
