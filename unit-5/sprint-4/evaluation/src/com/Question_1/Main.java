package com.Question_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No");
		int r=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String n=sc.next();
		System.out.println("Enter Address");
		String ad=sc.next();
		System.out.println("Enter Mobile No");
		String mob=sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) { 
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/sprint4eval";
		
		try(Connection c=DriverManager.getConnection(url,"root","@Keshav9#");) {
			
		PreparedStatement p=c.prepareStatement("insert into Student values(?,?,?,?)");
	   
	    p.setInt(1,r);
	    p.setString(2,n);
	    p.setString(3,ad);
	    p.setString(4,mob);
	    int z=p.executeUpdate(); 
	    if(z>0) {
	    	System.out.println("Insertion done");
	    }else {
	    	System.out.println("not done!");
	    }
		
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
