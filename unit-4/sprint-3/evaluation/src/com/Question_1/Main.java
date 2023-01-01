package com.Question_1;

public class Main {
	
	 public static Object[] changeArray(Object[] args) {
		 
		
		 for(int i=0; i<args.length; i++) {
			 
			 if(args[i] instanceof Student) {
				
				
				 
			 }
			 else if(args[i] instanceof Employee) {
				 
			 }else if(i==0) {
				 
			 }
			 
		 }
		 
		 return args;
	 }


	public static void main(String[] args) {
		
		Object[]  NewStudents= new Object[4];

		Student NewArr= new Student(23, "rakesh", 450);
		
		Employee NewEmployee =new Employee(12, "Lokesh", 84000);
	
		NewStudents[0]= NewArr;
		NewStudents[1]= NewEmployee;
		NewStudents[2]= "String";
		NewStudents[3]= 50;
		
		changeArray(NewStudents);
		
	    
		
	}

}
