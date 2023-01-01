package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer UserId;
	
	@NotNull(message="First name cannot be null!")
	@Pattern(regexp = "^[A-Za-z]*")
	private String firstName;
	
	@Pattern(regexp = "^[A-Za-z]*")
	private String lastName;
	
	@Pattern(regexp = "^[0-9]*", message = "Enter valid 10 digit mobile number")
	@Size(min = 10,max = 10)
	private String mobileNumber;
	
	
	private Integer[] currentPosition;
	
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,12}$", message = "Invalid Password pattern. Password must contain 6 to 12 characters at least one digit, lower, upper case and one special character.")
	private String password;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL,mappedBy ="MappedUser")
	private Driver MappedDriver;
	
}
