package com.Question_4;

import java.util.Scanner;

public class Child extends Parent{
	
	
     
    public Child(int number) {
		super(number);	
	}

	void method4() {
		
		System.out.println("Inside method4 of Child Class");
	}
	
	
	public static void main(String[] args) {
		
		  Scanner Sc=new Scanner(System.in);
		  System.out.println("take input");
		  
		  int Num=Sc.nextInt();
		  if(Num >= 1 && Num <= 10) {
			  Child NewChild=new Child(Num);
			  Parent NewParent=new Parent(Num);
			  
			  NewParent.method1();
			  NewParent.method3();		

		  }else {
			  System.out.println("Invalid number");
		  }
	}
}



