package com.masai.service;
import com.masai.exception.MailException;
import com.masai.model.Email;

public interface EmailService {

	public Email addEmail(Email email);
	public Email DeleteEmail(Email email);
	public Email StarEmail(Integer id) throws MailException;
	
	
}
