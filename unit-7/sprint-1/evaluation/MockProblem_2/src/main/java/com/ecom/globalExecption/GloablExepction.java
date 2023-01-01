package com.ecom.globalExecption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ecom.execption.EmailExepction;
import com.ecom.execption.UserExecption;

@ControllerAdvice
public class GloablExepction {
	
	@ExceptionHandler(EmailExepction.class)
	public ResponseEntity<String> emailExepEntity(EmailExepction e){
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_GATEWAY);
	}
	@ExceptionHandler(UserExecption.class)
	public ResponseEntity<String> userExecption(UserExecption e){
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_GATEWAY);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> allExepctionHandller(Exception e){
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_GATEWAY);
	}

}
