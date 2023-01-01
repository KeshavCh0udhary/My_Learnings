package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

    private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("e3-unit");
	}
	
	public static EntityManager provideEntityManager(){
		
		return emf.createEntityManager();
		
	}

	public static EntityManager provideEM() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
