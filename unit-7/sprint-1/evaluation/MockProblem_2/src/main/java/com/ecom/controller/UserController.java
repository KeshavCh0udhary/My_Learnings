package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.execption.EmailExepction;
import com.ecom.execption.UserExecption;
import com.ecom.models.Email;
import com.ecom.models.User;
import com.ecom.service.EmailService;
import com.ecom.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class UserController {
	@Autowired
	private EmailService emailService;
	@Autowired
	private UserService userService;
	public ResponseEntity<List<User>> getAllUsersList() throws UserExecption{
		return new ResponseEntity<List<User>>(userService.getAllUser(), HttpStatus.OK);
	}
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) throws UserExecption{
	
		return new ResponseEntity<User>(userService.createUser(user), HttpStatus.CREATED);
	}
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) throws UserExecption{
		return new ResponseEntity<User>(userService.getUserByEmailId(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<User> deleUserById(@PathVariable("id") Integer id) throws UserExecption{
		return new ResponseEntity<User>(userService.DeleteUserById(id), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/users/{id}/mail/{id1}")
	public ResponseEntity<Email> retriveDetailofEmail(@PathVariable("id") Integer id,@PathVariable("id1") Integer id1) throws EmailExepction{
		return new ResponseEntity<Email>(emailService.detailOfEmail(id, id1), HttpStatus.OK);
	}
	
	@PostMapping("/user/{id}/mail")
	public ResponseEntity<Email> createEmailOfUser(@RequestBody Email email,@PathVariable("id") Integer id) throws EmailExepction{
		return new ResponseEntity<Email>(emailService.createAEmailforUser(email, id), HttpStatus.CREATED);
	}

}
