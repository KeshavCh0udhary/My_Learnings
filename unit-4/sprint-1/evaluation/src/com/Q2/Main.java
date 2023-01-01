package com.Q2;

public class Main {

	public static void printMonths(String month) {
		// TODO Auto-generated method stub
        switch(month) {
        case "JAN":System.out.println("This is the 1st Month of the Year January");
        break;
        case "FEB":System.out.println("This is the 1st Month of the Year February");
        break;
        case "MAR":System.out.println("This is the 1st Month of the Year March");
        break;
        case "APR":System.out.println("This is the 1st Month of the Year April");
        break;
        case "MAY":System.out.println("This is the 1st Month of the Year May");
        break;
        case "JUN":System.out.println("This is the 1st Month of the Year June");
        break;
        case "JUL":System.out.println("This is the 1st Month of the Year July");
        break;
        case "AUG":System.out.println("This is the 1st Month of the Year August");
        break;
        case "SEP":System.out.println("This is the 1st Month of the Year Septmber");
        break;
        case "OCT":System.out.println("This is the 1st Month of the Year October");
        break;
        case "NOV":System.out.println("This is the 1st Month of the Year November");
        break;
        case "DEC":System.out.println("This is the 1st Month of the Year December");
        break;
        default: System.out.println("Invalid Input");
        break;
        }
	}
	public static void main(String[] args){
		//call printMonths with valid parameters
		printMonths("DEC");
		}

}
