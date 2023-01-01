package com.Usecases;

import com.Dao.TrainingDao;
import com.Dao.TrainingDaoImp;
import com.exceptions.CourseException;
import com.masai.entity.Student;

public class RegisterStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainingDao td= new TrainingDaoImp();
		
		Student s= new Student();
		
		s.setName("tomar");
		s.setEmail("csdc@gmail.com");
		s.setMobile("96316616");
		
		
		int course_id=1;
		
		try {
			td.registerStudent(s, course_id);
			System.out.println("record inserted succesfully!!");
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		

	}

}
