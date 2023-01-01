package com.impl;

import java.util.List;

import javax.persistence.*;

import com.beans.Address;
import com.beans.Customer;

import com.utility.DBUtil;

public class GetData {

	public static void main(String[] args) {

		EntityManager em = DBUtil.provideEntityManager();

		String jpql = "from Customer where cid=: cid";

		em.find(Customer.class, 3);

		javax.persistence.Query q = em.createQuery(jpql);
		q.setParameter("cid", 3);
		List<Customer> list = q.getResultList();

		List<Address> addrlist = list.get(0).getAdd();

		System.out.println("Customer name is :"+list.get(0).getName());
		
		for (Address a : addrlist) {
			System.out.println("State name is :" + a.getState());
			System.out.println("City name is :" + a.getCity());
			System.out.println("PinCode name is :" + a.getPincode());
			System.out.println("Address type is : " + a.getType());
			
			System.out.println("*******************");
		}

	}
}
