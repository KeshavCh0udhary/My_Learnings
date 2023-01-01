package com.LibraryManagementSystem;

import java.util.Objects;

public class Book {
	private int bookId;
	private String bookName;
	private String author;
	
	
	public Book() {
		super();
	}


	public Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}


	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		
		Book b1=this;
		Book b2=(Book)obj;
		
		return b1.bookId==b2.getBookId();
	}


	@Override
	public String toString() {
		return "Book {bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "}";
	}
	
	
}
