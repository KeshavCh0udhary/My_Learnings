package com.Dao;

import java.util.List;

import com.exceptions.CourseException;
import com.exceptions.TeacherException;
import com.masai.entity.Course;
import com.masai.entity.Student;
import com.masai.entity.Teacher;

public interface TrainingDao {
	public void addCourse(Course course) ;
	public void registerStudent(Student student, int courseId)throws CourseException;
	public void registerTeacher(Teacher teacher);
	public void assignTeacherWithCourse(int teacherId, int courseId) throws
	TeacherException, CourseException;
	List<Student> getAlltheStudentsByCourseName(String courseName)throws
	CourseException;




}
