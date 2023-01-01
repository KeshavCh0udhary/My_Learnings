package com.Question_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
public static void main(String[] args) {
	List<Integer> num=Arrays.asList(12,45,91,5,52,428,265,278,3212);
	List<Integer> nums=num.stream().map(x->x*x).collect(Collectors.toList());
	System.out.println(num);
	System.out.println(nums);
}
}