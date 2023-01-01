package com.masai.service;

import java.util.List;

import com.masai.exception.DriverException;
import com.masai.exception.UserException;
import com.masai.model.Driver;
import com.masai.model.User;

public interface UserService {

	public User addUser(User user) throws UserException;
	public List<Driver> findCab(User user)throws DriverException;
	public Driver bookCab(Integer UserId, Integer DriverId, Integer a, Integer b) throws DriverException; 
	
}
