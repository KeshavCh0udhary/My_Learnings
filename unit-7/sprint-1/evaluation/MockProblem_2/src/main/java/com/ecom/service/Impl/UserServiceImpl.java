package com.ecom.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Repo.UserRepo;
import com.ecom.execption.UserExecption;
import com.ecom.models.User;
import com.ecom.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public List<User> getAllUser() throws UserExecption {
		return userRepo.findAll();
		
	}

	@Override
	public User createUser(User user) throws UserExecption {
		
		return userRepo.save(user);
	}

	@Override
	public User getUserByEmailId(Integer userId) throws UserExecption {
		Optional<User> optional= userRepo.findById(userId);
		if(optional.isPresent()) {
			return optional.get();
		}
		throw new UserExecption("DataNot Found");
	}

	@Override
	public User DeleteUserById(Integer userid) throws UserExecption {
		
		Optional<User> optional= userRepo.findById(userid);
		if(optional.isPresent()) {
			userRepo.delete(optional.get());
			return optional.get();
		}
		throw new UserExecption("DataNot Found");
	}



}
