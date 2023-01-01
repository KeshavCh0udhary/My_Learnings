package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.DriverException;
import com.masai.exception.UserException;
import com.masai.model.Driver;
import com.masai.model.User;
import com.masai.repo.DriverRepo;
import com.masai.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private DriverRepo driverRepo;

	@Override
	public User addUser(User user) throws UserException {
		
		User NewUser = userRepo.save(user);
		
		if(NewUser !=null) return NewUser;
		
		throw new UserException("Please fill valid User details");
		
	}

	@Override
	public List<Driver> findCab(User user) throws DriverException {
		
		List<Driver> driverList = new ArrayList<>();
		
		Integer arr[] = user.getCurrentPosition();
		
		List<Driver> Users = driverRepo.findAll();
		
		int i = 0;
		
		while(i<Users.size()) {
			
			Driver newUser = Users.get(i);
			
			Integer arrX[] = newUser.getCurrentPosition();
			
            Integer x = arrX[0], y = arrX[1], x1 = arr[0], x2 = arr[1];
            
            int a = (int) Math.pow((x - x1),2);
        	int b = (int) Math.pow((y - x2),2);
        	
            Integer distance = (int) Math.sqrt(a+b);
            
            
            if(distance < 5) {
            	
            	driverList.add(newUser);
            	
            }
            
		}
		
		if(driverList.size() !=0) return driverList;
		
		throw new DriverException("No driver found in your area");
		
	}

	@Override
	public Driver bookCab(Integer UserId, Integer DriverId, Integer a, Integer b) throws DriverException {

		Optional<Driver> newDriver = driverRepo.findById(DriverId);
        Driver driver = newDriver.get();
        
        Integer arr[] = driver.getCurrentPosition();
        
        Integer x = a, y = b, x1 = arr[0], x2 = arr[1];
        
        Integer a1 = (int) Math.pow((x - x1),2);
        Integer b1 = (int) Math.pow((y - x2),2);
    	
        Integer distance = (int) Math.sqrt(a1+b1);
        
        if(distance < 5) {
        	
        	Integer positionArr[] = new Integer[2];
        	
        	positionArr[0] = a;
        	positionArr[1] = b;
        	
        	driver.setCurrentPosition(positionArr);
        	
        	return driverRepo.save(driver);
        	
        }
        
        throw new DriverException("Driver not found in your area");
        
		
	}

	
}
