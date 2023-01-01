package com.Question_3;

public class Shapes {
  public void area(Circle circle) {
	  double area=(circle.radius*circle.radius)*3.14;
	  
	  System.out.println("AREA OF CIRCLE IS = "+area);
  }
  
  public void area(Rectangle rectangle) {
	int l=rectangle.length;
	int b=rectangle.breadth;
	int a=l*b;
	
	System.out.println("AREA OF RECTANGLE IS = "+a);
  }
  
  
  public void area(Square square) {

	int s=square.side;
	int ar=s*s;
	
	System.out.println("AREA OF SQUARE IS = "+ar);
  }
}

