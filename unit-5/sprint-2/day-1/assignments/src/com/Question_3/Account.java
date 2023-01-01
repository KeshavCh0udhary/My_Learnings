package com.Question_3;

public class Account {

	String acc;
	double balance;

	public Account(String acc, double balance) {
		super();
		this.acc = acc;
		this.balance = balance;
	}

	void deposit(double amt) {
		balance = balance + amt;

	}

	public double withdraw(double amt)throws InsufficientFundException {
		double res = 0;
		
		if(amt<=balance) {
			balance=balance-amt;
			System.out.println("you have withdraw :"+amt+" "+"new balance is :"+balance);
			res=amt;
		}else {
			
			InsufficientFundException ife = new InsufficientFundException("you don't have sufficient balance to withdraw");
			throw ife;
			
			
			
		}
		
		

		return res;
	}

}
