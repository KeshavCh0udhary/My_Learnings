package com.masai.service;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.model.User;
import com.masai.repo.FIRRepo;
import com.masai.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	private FIRRepo firRepo;
	
	@Override
	public User addUser(User user) throws UserException {
		
        User NewUser = userRepo.save(user);
		
		if(NewUser !=null) return NewUser;
		
		throw new UserException("Please fill valid User details");
		
	}

	@Override
	public List<FIR> getAllFIR(Integer userId) throws FIRException, UserException {
		
		User user = userRepo.findById(userId).get();
		
		List<FIR> FirList = user.getListOfFire();
		
        if(FirList.size() != 0) return FirList;
		
		throw new FIRException("No fir registerd yet");
		
	}

	@Override
	public FIR deleteFIR(Integer firId, Integer userId) throws FIRException, UserException {
		
		User user = userRepo.findById(userId).get();
		
		List<FIR> FirList = user.getListOfFire();
		
		FIR newFir = firRepo.findById(firId).get();
		
		for(int i=0; i<FirList.size(); i++) {
			
			if(FirList.get(i).getFirId() == firId) {
				
				long time = Duration.between(FirList.get(i).getTimeStamp(),LocalDateTime.now()).toHours();
				
				int val = (int) time;
				
				if(val <= 24) {
					
					if(newFir != null)
					    firRepo.delete(newFir);
					return newFir;
				}
				
			}

		}
		
		
		throw new FIRException("No FIR found with this id");
		
	}

	
	
}
