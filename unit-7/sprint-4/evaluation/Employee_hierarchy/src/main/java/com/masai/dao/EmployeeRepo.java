package com.masai.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
    
	@Query("Select em From Employee em Where em.managerId = ?1")
	public List<Employee> GetAllReportees(Integer mamagerId) throws EmployeeException;
		
	
}
