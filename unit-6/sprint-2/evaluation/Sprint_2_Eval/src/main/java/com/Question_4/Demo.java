package com.Question_4;

import javax.persistence.EntityManager;

import com.emutil.EMUtil;

public class Demo {

	public static void main(String[] args) {
		EntityManager em = EMUtil.provideEntityManager();
		SalariedEmployee s = new SalariedEmployee();
		SalariedEmployee s1 = new SalariedEmployee();
		SalariedEmployee s2 = new SalariedEmployee();
		SalariedEmployee s3 = new SalariedEmployee();
		
		s.setEmpName("Keshav");
		s.setEmail("keshav@gmail.com");
		s.setSalary(10000);
		s1.setEmpName("Krishan");
		s1.setEmail("krishan@gmail.com");
		s1.setSalary(11000);
		s2.setEmpName("Satyam");
		s2.setEmail("satyam@gmail.com");
		s2.setSalary(12000);
		s3.setEmpName("Rahul");
		s3.setEmail("rahul@gmail.com");
		s3.setSalary(9000);
		
		ConractualEmployee c = new ConractualEmployee();
		ConractualEmployee c1 = new ConractualEmployee();
		ConractualEmployee c2 = new ConractualEmployee();
		ConractualEmployee c3 = new ConractualEmployee();
	    c.setEmpName("Ajay");
	    c.setCostofperday(500);
	    c.setMobileNumber("9304264670");
	    c.setNoOfWorkingDays(5);
	    
	    c1.setEmpName("Shivam");
	    c1.setCostofperday(600);
	    c1.setMobileNumber("9470672709");
	    c1.setNoOfWorkingDays(4);
	    
	    c2.setEmpName("Rohit");
	    c2.setCostofperday(700);
	    c2.setMobileNumber("9939100547");
	    c2.setNoOfWorkingDays(7);
	    
	    c3.setEmpName("Virat");
	    c3.setCostofperday(400);
	    c3.setMobileNumber("9939100557");
	    c3.setNoOfWorkingDays(8);
	    
	    em.getTransaction().begin();
	    em.persist(s);
	    em.persist(s1);
	    em.persist(s2);
	    em.persist(s3);
	    
	    em.persist(c);
	    em.persist(c1);
	    em.persist(c2);
	    em.persist(c3);
	    em.getTransaction().commit();
	    System.out.println("Done...");
	    em.close();
	    
	}
	
	
}

