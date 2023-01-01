package com.Question_4;

public class Parent {
	
	final int number;

	public void method1() {
		
		System.out.println("number is "+number);	
		System.out.println("Inside method1 of Parent Class");
		Parent NewParent=new Parent(7);
		NewParent.method2();	
	}
	
    private void method2(){
    	System.out.println("Inside method2 of Parent Class");
	}

    protected void method3(){
    	System.out.println("Inside method3 of Parent Class");
    	
    	Child NewChild=new Child(7);
    	NewChild.method4();
    }
    
	public Parent(int number){
		
		this.number = number;
		
	}
    	
}
