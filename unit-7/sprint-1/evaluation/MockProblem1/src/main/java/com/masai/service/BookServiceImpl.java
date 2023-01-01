package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.bean.Book;
import com.masai.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository brepo;
	@Override
	public List<Book> getAllBooks() {
		List<Book> list= brepo.findAll();
		return list;
	}

	@Override
	public Book getBookById(int id) {
		
	 Optional<Book> opt = brepo.findById(id);
		return opt.get();
	}

	@Override
	public Book createBook(Book book) {
		return brepo.save(book);
	}

	@Override
	public Book deleteBook(int id) {
	Optional<Book> b= brepo.findById(id);
	if(b.get()!=null) {
		brepo.deleteById(id);
	}
		return b.get();
	}

	@Override
	public Book updateBook(Book book, int id) {
		Optional<Book> b= brepo.findById(id);
		Book bo=null;
		if(b.isPresent()) {
			 bo= brepo.save(book);
		}
		return bo;	
	}
	
}


