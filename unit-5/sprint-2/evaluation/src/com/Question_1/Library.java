package com.Question_1;

import java.util.*;

public class Library {

	List<Book> B = new ArrayList<>();
	
	public void addBook(Book book)throws BookException{
		
		for(Book b : this.B) {
			
			if(b.getIsbn()==book.getIsbn() && b.getAuthor().equals(b.getAuthor())
				&& b.getBookName().equals(b.getBookName())) {
				
				BookException ex = new BookException("Same Book found");
				
				throw ex;
			}
			
			this.B.add(book);
		}
		
	}
	
	List<Book> viewAllBooks()throws BookException{
		
		if(B.size()==0) {
			BookException ex = new BookException("Library is Empty");
			throw ex;
		}
		
	}
	
	List<Book> viewBooksByAuthor(String author)throws BookException{
		
		
		
	}
	
	Book getBookByISBN(int isbn)throws BookException{
		
		
		
	}
	
}
