package com.Question_4;

public class Circle implements Shapes {
private int radius;

	public void setRadius(int radius) {
	this.radius = radius;
}

	@Override
	public void draw() {
		System.out.println("You have drawn Circle");
		System.out.println("The radius of circle is :"+ radius);
		System.out.println("===========================================");
		
	}

}