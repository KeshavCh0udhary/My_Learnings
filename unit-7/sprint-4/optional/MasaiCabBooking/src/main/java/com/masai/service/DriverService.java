package com.masai.service;

import com.masai.exception.DriverException;
import com.masai.model.Driver;

public interface DriverService {
 
	public Driver addDriver(Driver driver) throws DriverException;
	
}
