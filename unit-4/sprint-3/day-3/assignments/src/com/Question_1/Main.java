package com.Question_1;

public class Main {
	
	public static Person generatePerson(Person person) {
	
		
		
		if(person instanceof Student) {
			
			Student NewStudent= new Student();
			NewStudent.name="Krishna";
			NewStudent.gender="Male";
			NewStudent.city="Pune";
			NewStudent.pinCode="412208";
			NewStudent.state="Maharastra";
			NewStudent.studentId= 681;
			NewStudent.courseEnrolled="Web Development";
			NewStudent.courseFee=15000;
			return NewStudent;
			
		} 
		if(person instanceof Instructor){
			
			 Instructor NewInstructor= new Instructor(); 
			 NewInstructor.name="Keshav";
			 NewInstructor.gender="Male";
			 NewInstructor.city="Mumbai";
			 NewInstructor.pinCode="412208";
			 NewInstructor.state="Maharastra";
			 NewInstructor.instructorId=256;
			 NewInstructor.salary=1500000;
			 return NewInstructor;
			 
		}
		
		return person;
		
		
		
		
	}


	public static void main(String[] args) {

		Person newStudent = generatePerson(new Student());
		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newTeacher);
		

	}

}
