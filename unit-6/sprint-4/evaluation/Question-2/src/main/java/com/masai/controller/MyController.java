package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.AccountException;
import com.masai.exception.InsufficientFundException;
import com.masai.model.Account;
import com.masai.model.AccountDTO;
import com.masai.service.AccountService;




@RestController
public class MyController {
	
	@Autowired
	private AccountService sService;
	
	
	@PostMapping("/accounts")
	public ResponseEntity<Account> registerStudentHandler(@RequestBody Account acc) throws AccountException {
		
		Account savedStudent= sService.openAccount(acc);
		
		
		return new ResponseEntity<Account>(savedStudent, HttpStatus.CREATED);
			
	}
	
	@DeleteMapping("/accounts/{id}")
	public ResponseEntity<Account> deleteStudentByIdHandler( @PathVariable("id") Integer acc) throws AccountException{
		Account act=sService.deleteAccountByacc(acc);
		return new ResponseEntity<Account>(act,HttpStatus.OK);
		
		
	}
	
	
	
	@PutMapping("/accounts/{acc}/{dep}")
	public ResponseEntity<Account> updateStudentMarksHandler(@PathVariable("acc") Integer acc, @PathVariable("dep") Integer dep) throws AccountException{
		
		Account updatedStudent= sService.depositAmount(acc, dep);
		
		return new ResponseEntity<Account>(updatedStudent,HttpStatus.ACCEPTED);

		
		
	}
	
	@PutMapping("/withdrawlAccounts/{acc}/{deposit}")
	public ResponseEntity<Account> withdrawl(@PathVariable("acc") Integer acc, @PathVariable("deposit") Integer deposit) throws AccountException, InsufficientFundException{
	Account act=	sService.withdrawAmount(acc, deposit);
	
	return new ResponseEntity<Account>(act,HttpStatus.ACCEPTED);
	}
	

    @PostMapping("/accountDto")
	public ResponseEntity<String> transfer(@RequestBody AccountDTO actd) throws AccountException, InsufficientFundException{
	
	
	String str=sService.transferAmount(actd);
	
	return new ResponseEntity<String>(str,HttpStatus.ACCEPTED);
		
	}

}

