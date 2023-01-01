package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	String getNameAndAddressOfEmplyeeById(Integer empId);

	List<Employee> getEmployeeDetailsByAddress(String address);

}
