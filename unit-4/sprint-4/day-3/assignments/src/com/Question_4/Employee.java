package com.Question_4;

public class Employee {

	private Integer employeeId;
	private String employeeName;
	private double employeeSalary;
	private Department Department;
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Department getDepartment() {
		return Department;
	}
	public void setDepartment(Department department) {
		Department = department;
	}
	
	public Employee(Integer employeeId, String employeeName, double employeeSalary,
			com.Question_4.Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		Department = department;
	}
	
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", Department=" + Department + "]";
	}
	
	
	
	
	
	
}
