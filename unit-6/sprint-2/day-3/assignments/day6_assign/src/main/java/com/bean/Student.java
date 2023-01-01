package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int studentRoll;
	private String studentName;
	private String mobileNumber;
	private String email;

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(String studentName, String mobileNumber, String email) {
		super();
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
