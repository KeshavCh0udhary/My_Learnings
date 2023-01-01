package com.Usecases;

import com.Dao.TrainingDao;
import com.Dao.TrainingDaoImp;
import com.exceptions.CourseException;
import com.exceptions.TeacherException;

public class AssignTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainingDao td= new TrainingDaoImp();
		
		int teacherId=3;
		int coursId=1;
		
		try {
			td.assignTeacherWithCourse(teacherId, coursId);
			System.out.println("Assign Suceesfully");
		} catch (TeacherException | CourseException e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}
		

	}

}
