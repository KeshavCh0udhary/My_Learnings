package com.Question_1;

public class Employee {

	private int Id;
	private String Name;
    private int Salary;
    
	public Employee(int id, String name, int salary) {
		super();
		this.Id = id;
		this.Name = name;
		this.Salary = salary;
	}
	
	
	public int getId() {
		return Id;
	}
	
	public String getName() {
		return Name;
	}
	
	public int getSalary() {
		return Salary;
	}
    
    
}
