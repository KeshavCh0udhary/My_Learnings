package com.Question_4;

import java.util.Comparator;


public class StudentMarksComp implements Comparator<Student> {

	@Override
	public int compare(Student S1, Student S2) {
		return S1.getMarks() > S2.getMarks() ? -1 : S1.getMarks() < S2.getMarks() ? 1 : 0;
	}
}
