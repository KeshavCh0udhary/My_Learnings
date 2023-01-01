package com.masai.classes;

import java.util.List;

import javax.websocket.server.PathParam;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Contoller {
	
	private List<Book> books=new ArrayList<>();
	
	
	Contoller(){
		books.add(new Book(1, "3 Mistakes", "chetan bhagat", 7500));
			books.add	(new Book(2, "Arithmatic", "RD sharma", 450 ));
			books.add(new Book(3, "MATRIX", "suman singh", 520));
				books.add(new Book(4, "Math", "sugandha", 652));
	}
	
	
	
	
	@GetMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book>> getAllBooks(){
		
		if(books.size()==0) {
			throw new BookNotFoundException("No book available!!");
		}
		
		return new ResponseEntity<List<Book>>(books,HttpStatus.OK);
		
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getParticullarBook(@PathVariable("id") Integer id){
		
		boolean t=true;
		Book b=new Book();
		for(Book bk:books) {
			if(bk.getBookId()==id) {
				b=bk;
				t=false;
				
			}
		}
		if(t) {
			throw new BookNotFoundException("Book not found");
		}
		return new ResponseEntity<Book>(b,HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") Integer id){
		 List<Book> bks=new ArrayList<>();
		 boolean flag=false;
		for(Book bk:books) {
			if(bk.getBookId()!=id) {
				bks.add(bk);
				flag=true;
				
			}
		}
		
		books=bks;
	
	if(!flag)throw new BookNotFoundException("Book not found");
	return new ResponseEntity<String>("book deleted successfully!!",HttpStatus.BAD_REQUEST);
	
	}
	
	@PostMapping("/books")
	public ResponseEntity<String> addBookHandler(@RequestBody Book book){
		books.add(book);
		return new ResponseEntity<String>("Book added succesfully",HttpStatus.OK);
	}
	
	@PutMapping("/books/{id}")
	public ResponseEntity<String> update(@RequestBody Book book,@PathVariable Integer id){
		
		boolean flag=false;
		for(Book bk:books) {
			if(bk.getBookId()!=id) {
				bk.setAuthor(book.getAuthor());
				bk.setName(book.getName());
				bk.setPrice(book.getPrice());
				flag=true;
				
			}
		}
		return new ResponseEntity<String>("Book updated succesfully",HttpStatus.OK);
	}

}
