package com.Question_3;

public class Bank {
	
	public static Bank getBank() {
		Bank NewBank= new Bank();
		return NewBank;
	}
	
	private Bank(){
	      System.out. println("Inside private constructor of Bank");
	}

}
