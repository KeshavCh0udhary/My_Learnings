package com.ecom.service;

import java.util.List;

import com.ecom.execption.UserExecption;
import com.ecom.models.User;

public interface UserService {
	public List<User> getAllUser() throws UserExecption;
	public User createUser(User user) throws UserExecption;
	public User getUserByEmailId(Integer userId) throws UserExecption;
	public User DeleteUserById(Integer userid) throws UserExecption;
	
	
}
