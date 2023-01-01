package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.MailException;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masi.repo.UserRepo;

@Service 
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepo userRepo;

	@Override
	public User addUser(User user) throws UserException {
		
		User u = userRepo.save(user);
		
		if(u !=null) {
			return u;
		}else {
			throw new UserException("User don't exist");
		}
		
	}

	@Override
	public List<Email> getAllMails(Integer id) throws MailException {
		
		List<User> allUsers = userRepo.findAll();
		
		for(User u :allUsers) {
			if(u.getUserId() == id) {
				
				List<Email> email = u.getAllEmail();
				
				if(email.size()!=0) {
					return email;
				}else {
					throw new MailException("Mail not present");
				}
			}
		}
		return null;
	}

	@Override
	public List<Email> getStarredMails(Integer id) throws MailException {
		List<Email> NewEmail = new ArrayList<>();
		List<User> allUsers=userRepo.findAll();
		for(User u : allUsers) {
			if(u.getUserId()==id) {
				List<Email> email =u.getAllEmail();
				for(Email e : email) {
					if(e.getStarredOrNot()) {
						NewEmail.add(e);
					}
				}
			}
		}
		if(NewEmail.size()!=0) {
		   return NewEmail;
		}else {
			throw new MailException("No mail starred");
		}
	}


	@Override
	public User updateUser(User id) throws UserException {

		if(id!=null) {
			return userRepo.save(id);
		}else {
			throw new UserException("User can't be updated");
		}
	}
}