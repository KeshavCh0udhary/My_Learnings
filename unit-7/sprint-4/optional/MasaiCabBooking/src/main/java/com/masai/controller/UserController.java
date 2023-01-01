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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.DriverException;
import com.masai.exception.UserException;
import com.masai.model.Driver;
import com.masai.model.User;
import com.masai.repo.UserRepo;
import com.masai.service.UserService;

@RestController
@RequestMapping("/masaicab/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepo userRepo;
	
	@PostMapping("/register")
	public ResponseEntity<User> registerNewUser(@Valid @RequestBody User user) throws UserException{
		
		return new ResponseEntity<User>(userService.addUser(user),HttpStatus.CREATED);
	}
	
	@GetMapping("/findride/{UserId}")
	public ResponseEntity<List<Driver>> findRide(@PathVariable("UserId") Integer UserId) throws DriverException{
		
		User newUser = userRepo.findById(UserId).get();
		List<Driver> list = userService.findCab(newUser);		
		
		return new ResponseEntity<>(list,HttpStatus.OK);
		 
	}
	
	@PutMapping("/book/{userId}/{driverId}/{x}/{y}")
	public ResponseEntity<Driver> bookDriver(@PathVariable("userId") Integer userId,@PathVariable("driverId") Integer driverId, @PathVariable("x") Integer x, @PathVariable("y") Integer y) throws DriverException{
	
		return new ResponseEntity<>(userService.bookCab(userId, driverId, x, y),HttpStatus.OK);
		
	}
	
}
