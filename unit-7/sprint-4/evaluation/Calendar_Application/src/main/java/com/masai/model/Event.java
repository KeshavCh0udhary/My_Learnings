package com.masai.model;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eventId;
	
	private String eventName;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private String eventType;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	
}
