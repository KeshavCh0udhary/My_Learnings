package com.ans3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ans3.bean.Account;

public class AccountDaoImpl implements AccountDao {
	
	
	public Account findById(int id) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("accountUnit");		
		
		EntityManager em= emf.createEntityManager();
				
		Account acc= em.find(Account.class, id);
		
		if(acc != null)
			return acc;
		else
			System.out.println("Account does not exist");
		
		em.close();
		return null;
	}

	public String save(Account account) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em= emf.createEntityManager();
		
		Account acc= new Account(account.getId(),account.getEmail(),account.getAddress(),account.getBalance());
		
		em.getTransaction().begin();
		
		em.persist(acc);
		
		em.getTransaction().commit();
		
		System.out.println("Account saved successfully...");
			
		em.close();
		return null;
	}

	public String deleteAccountById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em= emf.createEntityManager();
		
		Account acc= em.find(Account.class, id);
		
		if(acc != null){
			
			em.getTransaction().begin();
			
			em.remove(acc);
			
			em.getTransaction().commit();
			
			
			System.out.println("Account removed....");
			
		}else
			System.out.println("Account not found...");
		
		em.close();
		return null;
	}

	public String withdraw(double amount, int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deposit(double amount, int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}

