package com.masai.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int postid;
	
	@NotNull (message= "Name cannot be empty. Please enter the name")
	private String name;
	
	@Column(unique = true)
	@NotNull 
	@Email (message= "Email cannot be empty. Please enter the valid email address")
	private String email;
	
	@Size(min = 2, max= 20, message = "Title must contain atleast 2 characters")
	private String posttitle;
	
	@Size(min = 10, max= 300, message = "Description must contain atleast 10 characters")
	private String postdesc;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
	private List<Comment> comment;
}
