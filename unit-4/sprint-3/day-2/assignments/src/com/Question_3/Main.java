package com.Question_3;

public class Main {

	private static Member Employee;
	private static Member Manager;
	
	public static void main(String[] args) {

		Employee = new Member();
		
		Employee.Name="Krishna Keshav";
		Employee.Age=22;
		Employee.PhoneNumber= "9304264670";
		Employee.Address="Ranchi";
		Employee.Salary=1500000.00;
		
	
		
		Member.printSalary(Employee.Salary,Employee.Name);
		
		Manager =new Member();
		
		Manager.Name="Krishna Keshav";
		Manager.Age=22;
		Manager.PhoneNumber= "9304264670";
		Manager.Address="Ranchi";
		Manager.Salary=1500000.00;
		
		Member.printSalary(Manager.Salary,Manager.Name);
		
		
	}

}
