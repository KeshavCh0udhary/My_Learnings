package com.masai.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;



@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	private String courseName;
	private int duration;
	private int fee;
	
	@Embedded
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "course")
	private List<Student> student=new ArrayList<Student>();
	
	
	
	@Embedded
	@ManyToOne
	private Teacher t;



	public int getCourseId() {
		return courseId;
	}



	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}



	public String getCourseName() {
		return courseName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public int getFee() {
		return fee;
	}



	public void setFee(int fee) {
		this.fee = fee;
	}



	public List<Student> getStudent() {
		return student;
	}



	public void setStudent(List<Student> student) {
		this.student = student;
	}



	public Teacher getT() {
		return t;
	}



	public void setT(Teacher t) {
		this.t = t;
	}



	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", fee=" + fee
				+ ", student=" + student + ", t=" + t + "]";
	}
	


}
