package com.serviceLayer;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.model.Course;
import com.model.Student;

@Service
public class StudentService {

	@Autowired
	private Map <Student,Course>theMap; 

	@Autowired
	private List<Student> theList;

	@Value("${appname}")
	private String appName; 

	public void printMap(){
		System.out.println("inside print map.......!\n");
		theMap.entrySet().stream().forEach(s->{
			System.out.println("-----------------------------\n");
			System.out.println("Student : "+s.getKey());
			System.out.println("Course : "+s.getValue());
		});

	}
	public void printList(){
		
		System.out.println("inside print list.......!\n");
		theList.sort((a,b)->a.getMarks()>b.getMarks()?1:-1);
		theList.forEach(s->{
			System.out.println("-----------------------------\n");
			System.out.println(s);
		});
		
	}
	public void printAppName(){
		
		System.out.println("-----------------------------\n");
		System.out.println("App name is : "+appName);
		
	}



}
