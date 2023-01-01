package com.Question_1;

public class Student {

	private int Roll;
	private String Name;
	private int Marks;
	
	public Student(int roll, String name, int marks) {
		super();
		this.Roll = roll;
		this.Name = name;
		this.Marks = marks;
	}
	
	
	
	public int getMarks() {
		return Marks;
	}
	
	public int getRoll() {
		return Roll;
	}
	
	public String getName(){
		return Name;
	}
	
}
