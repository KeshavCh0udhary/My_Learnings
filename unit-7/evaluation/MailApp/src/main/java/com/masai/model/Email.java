package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Email {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer emailId;
	private String desc;
	private Boolean starredOrNot;
	private String mailSentTo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;

}
