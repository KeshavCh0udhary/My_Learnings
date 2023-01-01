package com.miniProject;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student>{

	
	@Override
	public int compare(Student el1, Student el2) {
		// TODO Auto-generated method stub
		return el1.getMarks()>el2.getMarks() ? 1 : -1;
		
	}

}
