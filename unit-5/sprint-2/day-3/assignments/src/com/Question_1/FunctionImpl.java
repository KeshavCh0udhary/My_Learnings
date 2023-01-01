package com.Question_1;

import java.util.function.Function;

public class FunctionImpl implements Function <Student , String> {

	@Override
	public String apply(Student t) {
		if (t.name == "Keshav") {
			return "Hello";
		}
		return "Hii";
	}

}
