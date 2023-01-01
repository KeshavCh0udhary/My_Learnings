package com.ans3.usecase;

import java.util.Scanner;

import com.ans3.bean.Account;
import com.ans3.dao.AccountDao;
import com.ans3.dao.AccountDaoImpl;

public class Save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDao add=new AccountDaoImpl();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter account id");
		int id=sc.nextInt();
		
		System.out.println("Enter email");
		String em=sc.next();
		
		System.out.println("Enter address");
		String ad=sc.next();
		
		System.out.println("Enter balance");
		int ba=sc.nextInt();
		
		add.save(new Account(id,em,ad,ba));
	
	}

}

