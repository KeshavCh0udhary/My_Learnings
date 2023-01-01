package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.bean.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	
}

