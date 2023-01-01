package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
    private EmployeeDao dao;

	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee empl=dao.save(emp);
		return empl;
	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Optional<Employee> opt=dao.findById(empId);
		
		return opt.orElseThrow(()-> new EmployeeException("Employee does not found ...."));
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		// TODO Auto-generated method stub
		List<Employee> empl= dao.findAll();
		if(empl.size()>0) {
			return empl;
		}
		else {
			throw new EmployeeException("No Employee Registered");
		}
		
			
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
      Optional<Employee> opt = dao.findById(empId);
		
		if(opt.isPresent()) {
			Employee empl = opt.get();
			dao.delete(empl);
			return empl;
		}else {
			throw new EmployeeException("Employee id not found...");
		}
	}

	@Override
	public Employee loginEmployee(String email, String password) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {
		// TODO Auto-generated method stub
		List<Employee> empl =  dao.getEmployeeDetailsByAddress(address);
		
	if(empl.size()>0) {
			return empl;
		}else {
			throw new EmployeeException("invalide address");
		}
	
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
				Optional<Employee> opt = dao.findById(emp.getEmpId());
				if(opt.isPresent()) {
					return dao.save(emp);
				}else {
					throw new EmployeeException("Invalide employee details");
				}
				
	}

	@Override
	public String getNameAndAddressOfEmplyeeById(Integer empId) throws EmployeeException {
		
		String name=dao.getNameAndAddressOfEmplyeeById(empId);
		
		if(name != null) {
			return name;
		}
		else {
			 throw new EmployeeException("Employee not found..." + empId);
		}
		
	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

}
