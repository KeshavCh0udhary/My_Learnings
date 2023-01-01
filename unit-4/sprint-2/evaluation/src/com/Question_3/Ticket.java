package com.Question_3;

public class Ticket {
	
	int ticketid;
	int price;
	static int availableTickets;
	
	public int calculateTicketCost(int noOfTickets) {
		if(availableTickets!=0) {
			System.out.println("Available Tickets : "+availableTickets);
			int totalAmount = noOfTickets*price;
			return totalAmount;
		}else return -1;
	}
}


