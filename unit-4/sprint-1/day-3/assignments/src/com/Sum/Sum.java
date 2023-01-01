package com.Sum;


public class Sum {
	public static void SumOfNNaturalNumbers(int N) {
		int Sum=(N * (N + 1)/2);
			System.out.println(Sum);
	}
	public static void main(String[] args){
		int N=5;
		   SumOfNNaturalNumbers(N);
	}
}

