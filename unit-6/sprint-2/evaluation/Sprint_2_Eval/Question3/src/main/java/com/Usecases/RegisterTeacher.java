package com.Usecases;

import com.Dao.TrainingDao;
import com.Dao.TrainingDaoImp;
import com.masai.entity.Teacher;

public class RegisterTeacher {
	public static void main(String[] args) {
		TrainingDao td= new TrainingDaoImp();
		
		Teacher t= new Teacher();
		t.setEmail("teacher@gmail.com");
		t.setNoYearOfExperince(5);
		t.setTeacherName("sumit");
		td.registerTeacher(t);
		
		System.out.println("Done!!");
	}

}
