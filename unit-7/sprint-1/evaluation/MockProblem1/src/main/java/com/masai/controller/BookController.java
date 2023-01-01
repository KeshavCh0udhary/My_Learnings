package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.masai.bean.Book;
import com.masai.service.BookService;
@RestController
public class BookController {
	
	@Autowired
	BookService bservice;
	
	@PostMapping("/bookservice/books")
	public ResponseEntity<Book> createBookHandler (@RequestBody Book book) {
		Book b=bservice.createBook(book);
		return new ResponseEntity<Book>(b,HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/bookservice/books/{id}")
	public ResponseEntity<Book> getBookHandler(@PathVariable Integer id){
		Book b= bservice.getBookById(id);
		return new ResponseEntity<Book>(b,HttpStatus.OK);
	}
	
	@GetMapping("/bookservice/books")
	public ResponseEntity<List<Book>> getAllBookHandler(){
		List<Book> b= bservice.getAllBooks();
		return new ResponseEntity <List<Book>>(b,HttpStatus.OK);
	}
	
	@DeleteMapping("/bookservice/books/{id}")
	public ResponseEntity<Book> deleteBookHandler(@PathVariable Integer id ){
		Book b= bservice.deleteBook(id);
		return new ResponseEntity<Book>(b,HttpStatus.OK);
	}
	
	@PutMapping("bookservice/books/{id}")
	public ResponseEntity<Book> updateBookHandler(@RequestBody Book book ,@PathVariable Integer id){
		Book b =  bservice.updateBook(book, id);
		return new ResponseEntity<Book>(b,HttpStatus.OK);
	}
}

