package com.Question_3;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public void doTransaction(List<Payment> transaction) {
		for(Payment pay: transaction) {
			pay.doPayment();
		}
	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
		List<Payment> transaction=new ArrayList<Payment>();
		transaction.add(new CardPayment(8000));
		transaction.add(new CardPayment(7000));
		
		d.doTransaction(transaction);
		
		List<Payment> transaction2=new ArrayList<Payment>();
		transaction2.add(new CardPayment(6000));
		transaction2.add(new CardPayment(9000));
		
		d.doTransaction(transaction2);
		
	}

}

