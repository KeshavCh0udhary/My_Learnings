package com.impl;

import javax.persistence.EntityManager;

import com.beans.Address;
import com.beans.Customer;
import com.utility.DBUtil;

public class Demo {

	public static void main(String[] args) {

		Customer c = new Customer();
		c.setName("n1");
		c.setEmail("n1.gmail");
		c.setMobile(99009900);
		c.getAdd().add(new Address("delhi", "peeragrahi", "110031", "home"));
		c.getAdd().add(new Address("punjab", "bhatinda", "110041", "office"));
		c.getAdd().add(new Address("haryana", "gurugram", "110011", "work"));

		Customer c1 = new Customer();

		c1.setName("n3");
		c1.setEmail("n3.gmail");
		c1.setMobile(0000000);
		c1.getAdd().add(new Address("delhi", "peeragrahi", "110031", "home"));
		c1.getAdd().add(new Address("punjab", "bhatinda", "110041", "office"));
		c1.getAdd().add(new Address("haryana", "gurugram", "110011", "work"));

	EntityManager em = 	DBUtil.provideEntityManager();
	
	em.getTransaction().begin();
	em.persist(c);
	em.persist(c1);
	em.getTransaction().commit();
	//em.close();
	
	System.out.println("done");
		
	}

}
