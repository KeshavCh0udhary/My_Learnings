package com.Question_4;

import javax.persistence.Entity;

@Entity
public class SalariedEmployee extends Employee {
	private int salary;
	private String email;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
