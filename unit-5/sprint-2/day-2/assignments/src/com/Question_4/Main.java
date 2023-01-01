package com.Question_4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		PrintList pl = list -> {

			for (String ele : list) {
				System.out.println(ele);
			}

		};

		List<String> NewList = Arrays.asList("Ranchi", "Patna", "Darbhanga", "Pune", "Mumbai");

		pl.display(NewList);

	}

}
