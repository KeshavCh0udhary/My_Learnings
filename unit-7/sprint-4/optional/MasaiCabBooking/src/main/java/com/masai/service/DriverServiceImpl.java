package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.DriverException;
import com.masai.model.Driver;
import com.masai.repo.DriverRepo;

@Service
public class DriverServiceImpl implements DriverService{

	@Autowired
	private DriverRepo DriverRepo;

	@Override
	public Driver addDriver(Driver driver) throws DriverException {
		
        Driver NewUser = DriverRepo.save(driver);
		
		if(NewUser != null) return NewUser;
		
		else throw new DriverException("Please fill valid Driver details");
	}
	
}
