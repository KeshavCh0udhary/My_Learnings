package com.masai.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	private String Email;
	
	@NotNull(message="First name cannot be null!")
	@Pattern(regexp = "[A-Za-z]")
	private String firstName;
	
	@Pattern(regexp = "[A-Za-z]")
	private String lastName;
	
	@NotNull(message="Mobile number cannot be null!")
	@Pattern(regexp = "[0-9]", message = "Enter valid 10 digit mobile number")
	@Size(min = 10,max = 10)
	private String mobileNumber;
	
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,12}$", message = "Invalid Password pattern. Password must contain 6 to 12 characters at least one digit, lower, upper case and one special character.")
	private String password;
	
	@Past(message = "DOB must be in the past")
	private LocalDate dateOfBirth;
	
	@OneToMany
	List<Email> AllEmail =new ArrayList<>();
	
}
