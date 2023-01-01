package com.masai.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@NotNull
	@Email(message="user proper email format")
	@Id
	private String email;

	
	@NotNull(message = "FirstName should not be null")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "First Name must not contain numbers or special characters")
	private String firstName;
	
	@NotNull(message = "LastName should not be null")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "Last Name must not contain numbers or special characters")
	private String lastName;
	
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,12}$", message = "Invalid Password pattern. Password must contain 6 to 12 characters at least one digit, lower, upper case and one special character.")
	private String password;
	
	@Size(min = 10,max = 10, message="mobile number should be of 10 digits only")
	private String mobileNumber;
	

	@Past(message = "DOB should not be in future")
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date DOB;
	
	@JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
	 private List<Event> eventList = new ArrayList<>(); 
}
