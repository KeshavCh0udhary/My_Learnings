package com.masai.service;

import java.util.List;

import com.masai.exception.AccountException;
import com.masai.exception.InsufficientFundException;
import com.masai.model.Account;
import com.masai.model.AccountDTO;

public interface AccountService {

	
	public Account openAccount(Account acc)throws AccountException;
	
	
	
	public Account depositAmount(Integer acc, Integer depositAmount)throws AccountException;
	public Account deleteAccountByacc(Integer acc)throws AccountException;
	public Account withdrawAmount(Integer accno, Integer amount)throws
	AccountException, InsufficientFundException;
	
	
	public String transferAmount(AccountDTO dto)throws AccountException,
	InsufficientFundException;
	
}
