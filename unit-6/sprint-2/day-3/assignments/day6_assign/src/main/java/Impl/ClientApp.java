package Impl;

import javax.persistence.EntityManager;

import com.bean.College;
import com.bean.Student;
import com.utility.DBUtil;

public class ClientApp {

	public static void main(String[] args) {
		
	EntityManager em  =	DBUtil.provideEntityManager();
	
	College c0 = new College();
	c0.setCollegename("Amity");
	c0.setCollegeAddtrss("Delhi");
	
	College c1= new College();
	c1.setCollegename("BVIMR");
	c1.setCollegeAddtrss("Delhi");
	
	
	c0.getStdnts().add(	new Student("n1", "01010101", "n1.gmail"));	
	c0.getStdnts().add(	new Student("n2", "02020202", "n2.gmail"));	
	c0.getStdnts().add(	new Student("n3", "03030303", "n3.gmail"));	
	c0.getStdnts().add(	new Student("n4", "04040404", "n4.gmail"));	

	c1.getStdnts().add(new Student("m5", "55555555", "m5.gmail"));
	c1.getStdnts().add(new Student("m6", "66666666", "m6.gmail"));
	c1.getStdnts().add(new Student("m7", "77777777", "m7.gmail"));
	c1.getStdnts().add(new Student("m8", "88888888", "m8.gmail"));
		
	
		
				em.getTransaction().begin();
				em.persist(c0);
				em.persist(c1);
				em.getTransaction().commit();
				
				em.close();
		
				System.out.println("done....");
		
		
	}
	
	
	
}
