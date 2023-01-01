package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EventException;
import com.masai.exception.UserException;
import com.masai.model.Event;
import com.masai.model.User;
import com.masai.service.EventService;
import com.masai.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	EventService eservice;
	
	@Autowired
	UserService uservice;
	
	@PostMapping("/masaicalender/register")	
	public ResponseEntity<User> registerUserHandler(@Valid@RequestBody User user) throws UserException{
		User u= uservice.registerUser(user);
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
	}
	
	@PutMapping("/masaicalendar/user")
	public ResponseEntity<User> updateUserHandler(@Valid@RequestBody User user) throws UserException{
		User u= uservice.registerUser(user);
		return new ResponseEntity<User>(u,HttpStatus.OK);
	}
	
	@GetMapping("/masaicalendar/user/{type}")
	public ResponseEntity<List<Event>> getAllEvent(@PathVariable String eventType) throws EventException{
		List<Event> list= uservice.getAllEvent(eventType);
		return new ResponseEntity<List<Event>>(list, HttpStatus.OK);
	}
	
}
