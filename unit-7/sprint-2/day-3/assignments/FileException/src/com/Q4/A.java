package com.Q4;

import java.io.Serializable;

public class A implements Serializable {

	
transient	String name;
	 String add;
	 static String s = "sbdjf";
	
	
	
	public A() {
		// TODO Auto-generated constructor stub
	}

	public A(String name, String add) {
		super();
		this.name = name;
		this.add = add;
	}

	@Override
	public String toString() {
		return "A [name=" + name + ", add=" + add + "]";
	}
	
	
	
}
