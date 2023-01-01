package com.masai.service;

import java.util.List;

import com.masai.exception.MailException;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;

public interface UserService {

	public User addUser(User user) throws UserException;
	public List<Email> getAllMails(Integer id) throws MailException;
	public List<Email> getStarredMails(Integer id) throws MailException;
	public User updateUser(User user) throws UserException;
	
}
