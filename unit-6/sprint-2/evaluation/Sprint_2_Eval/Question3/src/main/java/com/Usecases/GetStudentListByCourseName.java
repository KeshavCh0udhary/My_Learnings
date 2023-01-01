package com.Usecases;

import java.util.List;

import com.Dao.TrainingDao;
import com.Dao.TrainingDaoImp;
import com.exceptions.CourseException;
import com.masai.entity.Student;

public class GetStudentListByCourseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		TrainingDao td= new TrainingDaoImp();
		
		try {
			List<Student> st=td.getAlltheStudentsByCourseName("Java");
		st.forEach(s -> System.out.println(s));
		} catch (CourseException e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}
	}

}
