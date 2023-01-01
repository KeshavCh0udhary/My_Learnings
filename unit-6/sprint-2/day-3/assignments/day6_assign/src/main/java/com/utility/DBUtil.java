package com.utility;

import javax.persistence.*;

public class DBUtil {

	

	private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("ClgStudentUnit");
	}
	
	public static EntityManager provideEntityManager(){
		
	
		return emf.createEntityManager();
	}
	
	
	
}
