package com.masai.classes;

public class BookNotFoundException extends RuntimeException{
	
	BookNotFoundException(){
		
	}
	BookNotFoundException(String msg){
		super(msg);
	}

}
