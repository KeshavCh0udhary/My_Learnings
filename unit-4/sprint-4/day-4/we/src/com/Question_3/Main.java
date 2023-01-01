package com.Question_3;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		LocalDate addWeek = date.plusWeeks(1);
		LocalDate addMonth = date.plusMonths(1);
		LocalDate addYear=date.plusYears(1);
		LocalDate add5Years=date.plusYears(5);
		System.out.println("Weak Added     : "+addWeek);
		System.out.println("Month Added    : "+addMonth);
		System.out.println("1 Year Added   : "+addYear);
		System.out.println("5 Year Added   : "+add5Years);

	}

}
