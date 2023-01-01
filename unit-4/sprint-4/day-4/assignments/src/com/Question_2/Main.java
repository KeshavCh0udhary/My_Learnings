package com.Question_2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
		 TreeSet<Employee> SortedEmployee =new TreeSet<>(new Sort());
		 
		 for(int i=0; i<4; i++) {

			 System.out.println("Enter Emoloyee id :  ");
			 int EmoloyeeId = sc.nextInt();
			 
			 sc.nextLine();
			 System.out.println("Enter Employee name : ");
			 String EmployeeName=sc.nextLine();
			 
			 System.out.println("Enter Employee Salary : ");
			 int EmployeeSalary=sc.nextInt();
			 
			 Employee NewEmployee=new Employee(EmoloyeeId,EmployeeName,EmployeeSalary);
			 SortedEmployee.add(NewEmployee);
			 
	     }

		 for(Employee i: SortedEmployee) {
			 System.out.println("Employee id "+i.getEmpId());
			 System.out.println("Employee name "+i.getEmpName());
			 System.out.println("Employee salary "+i.getSalary());
			 System.out.println("--------------------------------");
		 }
		 
	}

}
