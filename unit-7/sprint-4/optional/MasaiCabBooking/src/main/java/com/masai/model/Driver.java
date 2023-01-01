package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String DriverId;
	
	@NotNull(message="First name cannot be null!")
	@Pattern(regexp = "^[A-Za-z]*")
	private String firstName;
	
	@Pattern(regexp = "^[A-Za-z]*")
	private String lastName;
	
	@Pattern(regexp = "^[0-9]*", message = "Enter valid 10 digit mobile number")
	@Size(min = 10,max = 10)
	private String mobileNumber;
	
	private Integer[] currentPosition;
	
	@OneToOne
	private User MappedUser;
	
}
