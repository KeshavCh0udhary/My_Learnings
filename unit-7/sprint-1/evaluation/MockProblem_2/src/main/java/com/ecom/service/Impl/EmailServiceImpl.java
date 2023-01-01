package com.ecom.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Repo.EmailRepo;
import com.ecom.Repo.UserRepo;
import com.ecom.execption.EmailExepction;
import com.ecom.models.Email;
import com.ecom.models.User;
import com.ecom.service.EmailService;
@Service
public class EmailServiceImpl implements EmailService {
	@Autowired
	private EmailRepo emailRepo;
	@Autowired
	private UserRepo userRepo;

	@Override
	public Email detailOfEmail(Integer userId, Integer mailId) throws EmailExepction {
		Optional<Email> emailOptional= emailRepo.findById(mailId);
		Optional<User> useOptional= userRepo.findById(userId);
		if(useOptional.isPresent() && emailOptional.isPresent()) {
			return emailOptional.get();
		}
		throw new EmailExepction("data Not found");
	}

	@Override
	public Email createAEmailforUser(Email email, Integer userId) throws EmailExepction {
		Optional<User> useOptional= userRepo.findById(userId);
		if(useOptional.isPresent()) {
//			useOptional.get().setEmail(email);
			User user=useOptional.get();
			user.setEmail(email);
			User user2= userRepo.save(user);
			return user2.getEmail();
		}
		throw new EmailExepction("user id not found");
	}
	

}
