package com.Q1;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
	private int salary;
	private String dept;
	private String work_location;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getWork_location() {
		return work_location;
	}
	public void setWork_location(String work_location) {
		this.work_location = work_location;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", dept=" + dept + ", work_location=" + work_location + "]";
	}
	public Employee(int id, String name, int age,int salary,String dept,String work_location ) {
		super(id, name, age);
		this.salary = salary;
		this.dept = dept;
		this.work_location = work_location;
	}
	
	

	

	

}
