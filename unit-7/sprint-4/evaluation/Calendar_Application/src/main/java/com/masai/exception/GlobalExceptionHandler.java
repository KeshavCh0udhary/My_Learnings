package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.masai.exception.LoginException;
import com.masai.exception.MyErrorDetails;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> myexceptionHndler(MethodArgumentNotValidException mp){
		
		MyErrorDetails err= new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage("Validation error");
		err.setDetails(mp.getBindingResult().getFieldError().getDefaultMessage());
		
		
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
	}
	
	
	//Global
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myexceptionHndler2(Exception ie, WebRequest req){
		
		MyErrorDetails err= new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);	
	
	}
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> mynotFoundHandler(NoHandlerFoundException nfe,WebRequest req)  {
			
	
	MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));
	
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
					
	}
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetails> userExceptionHandler(UserException ue, WebRequest req){
		
		MyErrorDetails err= new MyErrorDetails();
			err.setTimestamp(LocalDateTime.now());
			err.setMessage(ue.getMessage());
			err.setDetails(req.getDescription(false));
				
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(EventException.class)
	public ResponseEntity<MyErrorDetails> eventExceptionHandler(EventException se, WebRequest req){
		
		
		MyErrorDetails err= new MyErrorDetails();
			err.setTimestamp(LocalDateTime.now());
			err.setMessage(se.getMessage());
			err.setDetails(req.getDescription(false));
				
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(UsernameNotFoundException.class)
	public ResponseEntity<MyErrorDetails> userNotFoundExceptionHandler(UsernameNotFoundException se, WebRequest req){
		
		
		MyErrorDetails err= new MyErrorDetails();
			err.setTimestamp(LocalDateTime.now());
			err.setMessage(se.getMessage());
			err.setDetails(req.getDescription(false));
				
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}

}
