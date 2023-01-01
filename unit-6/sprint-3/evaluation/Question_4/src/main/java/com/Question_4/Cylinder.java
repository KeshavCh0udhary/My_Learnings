package com.Question_4;

public class Cylinder implements Shapes {
	
	private int radius;
	private int side;
	
		public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("You have drawn a Cylinder");
		System.out.println("The radius of cyliner is : "+radius);
		System.out.println("Side of cylinder is : "+ side);
		System.out.println("===========================================");
	}

}
