package com.PrimeFactor1;

public class Prime {
	
	public static void printPrimeFactor(int N){
		if(N<2 || N>100) {
			System.out.println("Invalid Number");
			return;
		}
		for(int i=1; i<=N; i++) {
			if(N%i==0)
			System.out.println(i);
		}
			
	}
	public static void main(String[] args) {
		
		int N=99;
		printPrimeFactor(N);
	}

}
