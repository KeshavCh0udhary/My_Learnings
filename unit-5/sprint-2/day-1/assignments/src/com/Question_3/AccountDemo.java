package com.Question_3;

public class AccountDemo {

	public static void main(String[] args) {

		try {
			Account ac = new Account("90459045", 500);
			ac.deposit(300);
			//double res = ac.withdraw(600);
			double res = ac.withdraw(801);

			System.out.println("withdraw amount is :" + res);

		} 
		catch (InsufficientFundException ife) {
			System.out.println(ife.getMessage());
		}

		
		
		
		
		System.out.println("program terminated normally*******");
	}

}
