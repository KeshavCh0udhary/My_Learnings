package com.Question_4;

public class Main {

	public static void main(String[] args) {
		DemoThread kohli =new DemoThread();
		DhoniThread dhoni=new DhoniThread();
		RohitThread rohit =new RohitThread();
		kohli.setName("Kohli");
		dhoni.setName("Dhoni");
		rohit.setName("Rohit");
		dhoni.setPriority(10);
		rohit.setPriority(8);
		dhoni.start();
		rohit.start();
		kohli.start();
	}
}
