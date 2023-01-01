package com.masai.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.dao.EmployeeRepo;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo erepo;
	
	
	@Override
	public Employee createEmployee(Employee employee) throws EmployeeException {
		Employee e= erepo.save(employee);
		return e;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		Optional<Employee> opt= erepo.findById(employee.getId());
		if(opt.isPresent()) {
			return erepo.save(employee);
		}
		else
			throw new EmployeeException("No employee with given id found");
	}

	@Override
	public String deleteEmployee(Integer id) throws EmployeeException {
		Optional<Employee> opt= erepo.findById(id);
		if(opt.isPresent()) {
			erepo.deleteById(id);
			return "Employee with given id deleted";
		}
		throw new EmployeeException("No employee with given id found");
	}

	@Override
	public Employee getEmployeeById(Integer id) throws EmployeeException {
		Optional<Employee> opt= erepo.findById(id);
		if(opt.isPresent()) {
			Employee em= opt.get();
			return em;
		}
		throw new EmployeeException("No employee with given id found");
	}

}
