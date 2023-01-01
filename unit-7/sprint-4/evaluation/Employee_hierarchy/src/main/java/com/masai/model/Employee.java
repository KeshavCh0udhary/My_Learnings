package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employee_id;
	
	@NotNull(message = "First name should not be empty")
	private String firstName;
	
	@NotNull(message = "First name should not be empty")
	private String lastName;
	
	@Email
	private String email;
	private String phoneNumber;
	private double salary;
	private Integer managerId;
	
	
}
