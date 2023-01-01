package com.Question_3;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
	   Ticket ticket=new Ticket();
	   
	   
	   int Booking;
	   Scanner sc= new Scanner(System.in);
	   
	   System.out.println("Enter no of bookings:");
	   Booking=sc.nextInt();
	   
	   System.out.println("Enter the available tickets: ");
	   ticket.availableTickets=sc.nextInt();
	   
	   int Input=0;
	   while(Input<Booking) {
		   
		   System.out.println("Enter the ticketid:");
		   ticket.ticketid=sc.nextInt();
		   
		   System.out.println("Enter the price:");
		   ticket.price=sc.nextInt();
		   
		   System.out.println("Enter the no of tickets:");
		   int noOfTickets=sc.nextInt();
		   
		   int Amount=ticket.calculateTicketCost(noOfTickets);
		   System.out.println("Total amount: "+Amount);
		   
		   int avilableTicket=ticket.availableTickets-noOfTickets;
		   
		   System.out.println("Available ticket after booking: "+avilableTicket);
		   
		   ticket.availableTickets=avilableTicket;
		   
		   Input++;
	   }
	   
	}
}
