package com.ans3.usecase;

import com.ans3.dao.AccountDao;
import com.ans3.dao.AccountDaoImpl;

public class Find {

	public static void main(String[] args) {
		AccountDao ad=new AccountDaoImpl();
		
		System.out.print(ad.findById(2));
		
	}

}
