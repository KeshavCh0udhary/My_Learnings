package com.Question_1;

public class OLA {

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger <= 3) {
			HatchBack NewHatchBack = new HatchBack(numberOfPassenger,numberOfKMs);
			return NewHatchBack;
			
		}else {
			Sedan NewSedan = new Sedan(numberOfPassenger,numberOfKMs);
			return NewSedan;	
		}
	}
	
	public int calculateBill(Car car) {
		
		if(car instanceof HatchBack) {
			
			HatchBack NewHatchBack =(HatchBack) car;
			int TotalFare = NewHatchBack.farePerKm*NewHatchBack.getNumberOfKms();
			return TotalFare;
			
		}else {
			
			Sedan NewSedan =(Sedan) car;
			int TotalFare = NewSedan.farePerKm*NewSedan.getNumberOfKms();
			return TotalFare;
		}
	}

}
