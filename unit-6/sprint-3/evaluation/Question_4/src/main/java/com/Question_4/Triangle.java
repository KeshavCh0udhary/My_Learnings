package com.Question_4;

public class Triangle implements Shapes {
 private int side ;
 
	public void setSide(int side) {
	this.side = side;
}

	@Override
	public void draw() {
		System.out.println("You have drawn Traingle");
		System.out.println("The side of Tringle is :"+side);
		System.out.println("=================================");
		
	}

}
