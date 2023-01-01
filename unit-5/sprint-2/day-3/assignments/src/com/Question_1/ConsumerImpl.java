package com.Question_1;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer <Student> {

	@Override
	public void accept(Student t) {
		
		System.out.println(t.name);
		System.out.println(t.id);
		
	}
}