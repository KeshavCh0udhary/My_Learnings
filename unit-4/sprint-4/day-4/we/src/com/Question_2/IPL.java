package com.Question_2;

import java.util.Scanner;

public class IPL {



	static void homeTeamStadium(Stadium stadium) {
    	 
    	 
    	 if(Stadium.EDEN_GARDENS_STADIUM==stadium)
    		 System.out.println("This is the home ground of KKR");
    	 
    	 if(Stadium.WANKHEDE_STADIUM==stadium)
     		System.out.println("This is the home ground of Mumbai Indians");
   	 
    	 if(Stadium.CHIDAMBARAM_STADIUM==stadium)
      		System.out.println("This is the home ground of CSK");
    	 
    	 if(Stadium.M_CHINNASWAMY_STADIUM==stadium)
       		System.out.println("This is the home ground of RCB");
    	 
    	 
     }
     
     public static void main(String[] args) {
    	 
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.println("eden for kolkata,wankhede for mumbai,chidambaram for chennai,chinnaswamy for bangalore");
  
    	 IPL NewIPL = new IPL();
    	 
    	 String Input = sc.next();
    	 
  
         if(Input.equals("eden")) {
        	 
            Stadium stadium=Stadium.EDEN_GARDENS_STADIUM;
            NewIPL.homeTeamStadium(stadium);
            
         }else if(Input.equals("wankhede")) {
        	 
           	Stadium stadium=Stadium.WANKHEDE_STADIUM;
           	NewIPL.homeTeamStadium(stadium);
           	
         }else if(Input.equals("chinnaswamy")) {
        	 
           	Stadium stadium=Stadium.M_CHINNASWAMY_STADIUM;
           	NewIPL.homeTeamStadium(stadium);
           	
         }else if(Input.equals("chidambaram")) {
        	 
            Stadium stadium=Stadium.CHIDAMBARAM_STADIUM;
           	NewIPL.homeTeamStadium(stadium); 
           	
         }
    	 
     }
     
 
}
