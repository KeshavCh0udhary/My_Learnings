package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.DriverException;
import com.masai.model.Driver;
import com.masai.service.DriverService;

@RequestMapping("/masaicab/driver")
@RestController
public class DriverController {

	@Autowired
	private DriverService driverService;
	
	@PostMapping("/register")
	public ResponseEntity<Driver> registerDriver(@RequestBody Driver driver) throws DriverException{
		
		return new ResponseEntity<Driver>(driverService.addDriver(driver),HttpStatus.CREATED);
		
	}
	
}
