package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.FIRException;
import com.masai.model.FIR;
import com.masai.service.FIRService;

@RequestMapping("/masaifir/user")
@RestController
public class FIRController {
	
	@Autowired
	private FIRService FirService;
	
	@PostMapping("/fir")
	public ResponseEntity<FIR> fileFIR(@RequestBody FIR fir) throws FIRException{
		
		return new ResponseEntity<FIR>(FirService.addFIR(fir),HttpStatus.CREATED);
		
	}
	
}
