package com.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	private static EntityManagerFactory emf;
	
	static {
		
		emf=Persistence.createEntityManagerFactory("question3");
	}

	public static EntityManager getEM() {
		
		return emf.createEntityManager();
	}
}
