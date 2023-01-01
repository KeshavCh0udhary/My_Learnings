package com.ecom.service;

import com.ecom.execption.EmailExepction;
import com.masai.models.Email;

public interface EmailService {
	public Email detailOfEmail(Integer userId,Integer mailId);
	public Email createAEmailforUser(Email email,Integer userId);

}
