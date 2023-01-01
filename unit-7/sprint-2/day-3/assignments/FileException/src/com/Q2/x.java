package com.Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class x {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D://nk.txt");
		//FileOutputStream fos = new FileOutputStream("E://nkp.txt");
		
		int n = fis.read();
		while(n!=-1) {
			//fos.write(n);
			System.out.print((char)n);
			n= fis.read();
		}
		//fos.flush();
		System.out.println("ok..");
	}
}
