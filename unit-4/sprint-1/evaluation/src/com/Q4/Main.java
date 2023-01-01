package com.Q4;
// 
public class Main {
public static void runScored(int one, int two, int three, int four ,int six) {
// write your logic here
	int Sum=0;
	Sum=(one*1)+(two*2)+(three*3)+(four*4)+(six*6);
	System.out.println(Sum);
}
public static void main(String[] args){
//call runScored with valid parameters
	runScored(1,2,3,4,6);
}
}