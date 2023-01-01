package com.masai.classes;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionsHandellor {
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<MyErrorDetails> bookNotFound(BookNotFoundException ie,WebRequest we){
		
		MyErrorDetails med = new MyErrorDetails();
		med.setTimeStamp(LocalDateTime.now());
		med.setMessage(ie.getMessage());
		med.setDetails(we.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(med,HttpStatus.BAD_REQUEST);
		
		
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> bookNotFound(Exception ie,WebRequest we){
		
		MyErrorDetails med = new MyErrorDetails();
		med.setTimeStamp(LocalDateTime.now());
		med.setMessage(ie.getMessage());
		med.setDetails(we.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(med,HttpStatus.BAD_REQUEST);
		
		
	}
	
}
