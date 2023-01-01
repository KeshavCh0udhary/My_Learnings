package com.Q1;

import java.io.Serializable;

public class Student extends Person implements Serializable {

	private int roll;
	private int marks;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int id, String name, int age, int roll, int marks) {
		super(id, name, age);
		this.roll = roll;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + "]";
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	

}
