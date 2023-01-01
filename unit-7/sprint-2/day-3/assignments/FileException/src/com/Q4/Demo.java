

package com.Q4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	
	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("abc.txt"));
		
		os.writeObject(new A("nitin","kumar"));
		os.flush();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
		  A a = (A)ois.readObject();
		  System.out.println(A.s);
	}
}
