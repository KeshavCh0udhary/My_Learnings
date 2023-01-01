package com.Question_1;

import java.util.function.Supplier;

public class SupplierImpl implements Supplier<Student>{

	@Override
	public Student get() {
		return new Student (12,"Keshav");
	}

}
