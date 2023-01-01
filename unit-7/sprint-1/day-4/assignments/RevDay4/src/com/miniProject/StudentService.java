package com.miniProject;

import java.util.List;

public interface StudentService {
	
  public List<Student> addStudent(Student student);
  public Student deleteStudent(Integer studentId);
  public Student findStudent(Integer studentId);
  public Student findStudentbyPincode(Integer pincode);
  public List<Student> sortStudent(List<Student> list);
  public List<Integer> Marks(List<Student> list);
  public List<Student> addAllStudent(List<Student> list);
  public List<Student>  getAll();

}
