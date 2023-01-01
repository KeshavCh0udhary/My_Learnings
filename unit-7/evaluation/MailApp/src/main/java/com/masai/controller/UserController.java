package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.MailException;
import com.masai.exception.UserException;
import com.masai.model.User;
import com.masai.service.UserService;
import com.masai.model.Email;

@RestController
@RequestMapping("/masaimail")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<User> addUser(@RequestBody User user) throws UserException {
		User u = userService.addUser(user);
		return new ResponseEntity<>(u,HttpStatus.CREATED);
	}
	@GetMapping("/mail/{userId}")
	public ResponseEntity<List<Email>> getAllMails(@PathVariable("userId") Integer id) throws MailException{
		List<Email> mails = userService.getAllMails(id);
		return new ResponseEntity<>(mails,HttpStatus.OK);
	}
	@GetMapping("/starred/{userId}")
	public ResponseEntity<List<Email>> getAllStarredMails(@PathVariable("userId") Integer id) throws MailException{
		List<Email> mails=userService.getStarredMails(id);
		return new ResponseEntity<>(mails,HttpStatus.OK);
	}
	@PutMapping("/user")
	public ResponseEntity<User> upadateUser(@RequestBody User user) throws UserException{
		User u=userService.updateUser(user);
		return new ResponseEntity<>(u,HttpStatus.OK);
	}
}