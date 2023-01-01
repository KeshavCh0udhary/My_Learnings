package com.Question_2;

public class CheckChar {
     
	 void character(char args) {
		  if(args=='a' || args=='A' || args=='e' || args=='E' || args=='i' || args=='I' || args=='o' || args=='O' || args=='u' || args=='U') {
			  System.out.println("character is vowel");
			  
		  }else if((args>'a' && args<='z') || (args>'A' && args<='Z')) {
			  System.out.println("character is constant"); 
			  
		  }else {
			  System.out.println("Error"); 
			  
		  }
	  }
		public static void main(String[] args) {
			
			CheckChar Char= new CheckChar();
			Char.character('a');
			Char.character('K');
			Char.character('}');
		}
}
