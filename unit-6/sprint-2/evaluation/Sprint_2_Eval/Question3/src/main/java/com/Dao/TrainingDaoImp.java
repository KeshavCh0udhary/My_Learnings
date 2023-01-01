package com.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.exceptions.CourseException;
import com.exceptions.TeacherException;
import com.masai.entity.Course;
import com.masai.entity.Student;
import com.masai.entity.Teacher;


public class TrainingDaoImp implements TrainingDao {

	@Override
	public void addCourse(Course course) {
		
	EntityManager em=	EMUtil.getEM();
	em.getTransaction().begin();
	em.persist(course);
	
	em.getTransaction().commit();
	
	
		
	}

	@Override
	public void registerStudent(Student student, int courseId) throws CourseException {
		EntityManager em=	EMUtil.getEM();
		Course cor=em.find(Course.class, courseId);
		if(cor==null)throw new CourseException();
		
		student.getCourse().add(cor);
		
		em.getTransaction().begin();
		cor.getStudent().add(student);
		em.persist(student);
		
		em.getTransaction().commit();
		
		
		
		
	}

	@Override
	public void registerTeacher(Teacher teacher) {
		EntityManager em=	EMUtil.getEM();
		em.getTransaction().begin();
		em.persist(teacher);
		
		em.getTransaction().commit();
		
		
		
		
		
	}

	@Override
	public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException {
		
		EntityManager em=	EMUtil.getEM();
		Teacher t=em.find(Teacher.class, teacherId);
		if(t==null)throw new TeacherException();
		Course c= em.find(Course.class, courseId);
		if(c==null)throw new CourseException();
		
		em.getTransaction().begin();
		
		t.getCor().add(c);
		c.setT(t);
		
		em.getTransaction().commit();
		
	}

	@Override
	public List<Student> getAlltheStudentsByCourseName(String courseName) throws CourseException {
		EntityManager em=	EMUtil.getEM();
		String jpql="from Course where Course.courseName=:per";
		
		
		
		TypedQuery<Course> cr=em.createQuery(jpql,Course.class);
		cr.setParameter( "per", courseName);
		
//		if(cr==null)System.out.println("null");
		
		
		return cr.getSingleResult().getStudent();
	}

	

	

}
