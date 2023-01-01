package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.EmployeeRepo;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	public EmployeeRepo eRepo;
	
	@Override
	public Employee AddEmployee(Employee employee) {
		return eRepo.save(employee);
	}

	@Override
	public Employee GetEmployee(Integer id) throws EmployeeException {
		
		Employee MyEmp = eRepo.findById(id).get();
		
		if(MyEmp != null) return MyEmp;
		
		else throw new EmployeeException("Employee is not found with this id");
	}

	@Override
	public Employee GetEmployeeManager(Integer id) throws EmployeeException {
		
        Employee MyEmp = eRepo.findById(id).get();
		
        Integer ManagerId = MyEmp.getManagerId();
        
        Employee Manager = eRepo.findById(ManagerId).get();
        
		if(Manager != null) return Manager;
		
		else throw new EmployeeException("Manager is not found with this id");
		
	}

	@Override
	public List<Employee> getEmployeesReportees(Integer ManagerId) throws EmployeeException {
		
		List<Employee> AllReportees = eRepo.GetAllReportees(ManagerId);
		
		if(AllReportees.size() != 0) return AllReportees;
		
		else throw new EmployeeException("Reportees is not found with this ManagerId");
		
	}

}
