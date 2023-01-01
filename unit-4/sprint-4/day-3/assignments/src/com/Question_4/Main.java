package com.Question_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		Collection<Employee> NewEmployee=new ArrayList<>();
		
		System.out.println("...Welcome to Employee Management System....");
		
		boolean flag=true;
		
		while(flag) {
			System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
			String Responce = sc.nextLine();
			
			int j=1;
			if(Responce.equals("y") || Responce.equals("Y")) {
				
				System.out.println("-------------------------------");
				
				System.out.println("Enter the Employee Details: "+ (NewEmployee.size()+1));
				
				System.out.println("Enter the Employee Id:");
				int id =sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter the Employee Name:");
				String name=sc.nextLine();
//				sc.nextLine();
				
				System.out.println("Enter the Employee Salary:");
				double sal=sc.nextDouble();
	
				System.out.println("Enter the Department Id:");
				int eid=sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter the Department Name:");
				String dn=sc.nextLine();
				
				
				Department d= new Department(eid,dn);
				Employee Emp= new Employee(id,name,sal,d);
				
				NewEmployee.add(Emp);
			}	
			
			else if(Responce.equals("n") || Responce.equals("N")){
				System.out.println("Thank you---");
				
				boolean Flag =true;
			
				while(Flag) {
					
					System.out.println("Enter the your choice");
					System.out.println("1: Find Employee in Particular Department"); 
					System.out.println("2: Remove Particular Employee");
					System.out.println("3: Print Employees in All Departments");
					
					int Case=sc.nextInt();
		
					switch(Case) {
					    
					    case 1:  
					    	System.out.println("Enter the Department Id:");
							int DepartmentID=sc.nextInt();

							for(Employee i: NewEmployee) {
								Department NewDepartment = i.getDepartment();
								if(NewDepartment.getDepartmentId()==DepartmentID) {
									System.out.println("Employee Name: "+i.getEmployeeName());
									System.out.println("Employee Id: "+i.getEmployeeName());
									System.out.println("Employee Salary: "+i.getEmployeeSalary());
									System.out.println("==================================");
								}
							}
							break;
							
					    case 2 : 
					    	System.out.println("Enter Department Id:");
							int DepartmentID1=sc.nextInt();
							System.out.println("Enter the Employee Id:");
							int DepartmentID2=sc.nextInt();
							
							if(NewEmployee.size()==0) {
								System.out.println("Employee doesn't exists...");
								break;
							}
							for(Employee i: NewEmployee) {
								Department dep=i.getDepartment();
								System.out.println(dep);
								if(dep.getDepartmentId()==DepartmentID1 && i.getEmployeeId()==DepartmentID2) {
									NewEmployee.remove(i);
									System.out.println(i.getEmployeeName()+ " Employee is removed from the department "+ DepartmentID1 +" successfully");
									break;
								}
							}
							break;
						
					    case 3 :
					    	
					    	if(NewEmployee.size()==0) {
								System.out.println("Employee doesn't exists...");
								break;
							}
					    	
					    	for(Employee i: NewEmployee) {
								Employee Emp = new Employee();
								Emp.setEmployeeId(i.getEmployeeId());
								Emp.setEmployeeName(i.getEmployeeName());
								Emp.setEmployeeSalary(i.getEmployeeSalary());		
								Emp.setDepartment(i.getDepartment());
								System.out.println(Emp.toString()); 
								System.out.println("---------------------------------");
							}
					    	break;
					}
					
					System.out.println("Do you want to Exit: ? (Y/N)");
					String ExistResponce=sc.next();
					
					if(ExistResponce.equals("n") || ExistResponce.equals("N")) {
						continue;
					}else if(ExistResponce.equals("y") || ExistResponce.equals("Y")) {
						System.out.println("Thank you---");
						
						Flag=false;	 flag=false;
						
						return;
					}
					
				}
				
				
			}	
		}
	}
}