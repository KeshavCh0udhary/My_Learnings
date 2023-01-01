package com.Question_1;

import java.util.function.Predicate;

public class PredicateImpl  implements Predicate <Student> {
	

	@Override
	public boolean test(Student t) {
		if (t.name=="Keshav") {
			return true;
		}
		return false;
	}

}
