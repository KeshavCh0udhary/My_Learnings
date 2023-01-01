package com.masai.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
