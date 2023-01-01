package com.Usecases;

import com.Dao.TrainingDao;
import com.Dao.TrainingDaoImp;
import com.exceptions.TeacherException;
import com.masai.entity.Course;

public class AddCourse {

	
	public static void main(String[] args) {
		TrainingDao td= new TrainingDaoImp();
		
		Course c= new Course();
		
		c.setCourseName("Java");
		c.setDuration(2);
		c.setFee(5000);
	
			td.addCourse(c);
		
			// TODO Auto-generated catch block
		
		
		System.out.println("done");
		
	}
}
