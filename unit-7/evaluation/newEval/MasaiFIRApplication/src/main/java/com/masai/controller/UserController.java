package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.model.User;
import com.masai.service.UserService;

@RestController
@RequestMapping("/masaifir/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<User> registerNewUser(@Valid @RequestBody User user) throws UserException{
		
		return new ResponseEntity<User>(userService.addUser(user),HttpStatus.CREATED);
	}
	
	@GetMapping("/fir/{userId}")
	public ResponseEntity<List<FIR>> getAllFir(@PathVariable("userId")Integer userId) throws FIRException, UserException{
				
		List<FIR> list = userService.getAllFIR(userId);		
		
		return new ResponseEntity<>(list,HttpStatus.OK);
		 
	}
	
	@DeleteMapping("/fir/{firId}/{UserId}")
	public ResponseEntity<FIR> deleteFIR(@PathVariable("firId")Integer firId,@PathVariable("UserId")Integer userId) throws  UserException, FIRException{
	
		return new ResponseEntity<>(userService.deleteFIR(firId, userId),HttpStatus.OK);
		
	}
	
}
