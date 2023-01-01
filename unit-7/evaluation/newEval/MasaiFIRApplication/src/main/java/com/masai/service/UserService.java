package com.masai.service;

import java.util.List;

import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.model.User;

public interface UserService {
	
	public User addUser(User user) throws UserException;
	public List<FIR> getAllFIR(Integer userId) throws FIRException,UserException;
	public FIR deleteFIR(Integer firId, Integer UserId) throws FIRException,UserException;
	
}