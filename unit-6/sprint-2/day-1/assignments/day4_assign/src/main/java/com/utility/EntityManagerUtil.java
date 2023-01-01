package com.utility;

import javax.persistence.*;

public class EntityManagerUtil {

	

	private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("EmployeeUnit");
	}
	
	public static EntityManager provideEntityManager(){
		
		//EntityManager em= emf.createEntityManager();
		//return em;
		
		return emf.createEntityManager();
	}
	
	
	
}
