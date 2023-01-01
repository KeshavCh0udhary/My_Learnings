package com.masai.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookid;
	private String name;
	private String author;
	private String publication;
	private String category;
	private int pages;
	private int price;
	
	
}
