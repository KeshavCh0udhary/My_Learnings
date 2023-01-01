package com.miniProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class StudentServiceImplementation implements StudentService{
	
    List<Student> list=new ArrayList<Student>();
    
	public StudentServiceImplementation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Student> addStudent(Student student) {
		// TODO Auto-generated method stub
		list.add(student);
		return list;
	}

	@Override
	public Student deleteStudent(Integer studentId) {
		// TODO Auto-generated method stub
		for(Student x:list) 
		if(x.getId()==studentId) {
		   list.remove(x);
		   return x;
		}
		
		return null;
	}

	@Override
	public Student findStudent(Integer studentId) {
		// TODO Auto-generated method stub
		for(Student x:list) 
		if(x.getId()==studentId) 
		   return x;
			
		return null;
	}

	@Override
	public Student findStudentbyPincode(Integer pincode) {
		// TODO Auto-generated method stub
		for(Student x:list) {
			Address address=x.getAddress();
			if((int)address.getPincode()==(int)pincode)
				return x;	
		}
		
		return null;
	}

	@Override
	public List<Student> sortStudent(List<Student> list) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts=new TreeSet<>(new SortByName());
		for(Student c:list) {
			ts.add(c);
		}
		
		List<Student> ll=new LinkedList<>();
		for(Student v:ts)
			ll.add(v);
				
	    return ll;
	}

	@Override
	public List<Integer> Marks(List<Student> list) {
		// TODO Auto-generated method stub
		List<Integer> listI=new ArrayList<>();
		for(Student g:list) {
			listI.add(g.getMarks());
		}
		return listI;
	}

	@Override
	public List<Student> addAllStudent(List<Student> list1) {
		// TODO Auto-generated method stub
		for(int i=0;i<list1.size();i++) {
				list.add(list1.get(i));
		}
		TreeSet<Student> ts1 = new TreeSet<>(new SortByMarks());
		
		for(Student c:list) ts1.add(c);
		
		
		List<Student> ll=new LinkedList<>();
		
		for(Student v:ts1) ll.add(v);
		
	    return ll;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return list;
	}

}
