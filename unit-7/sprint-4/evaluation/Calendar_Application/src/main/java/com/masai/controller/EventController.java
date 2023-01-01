package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EventException;
import com.masai.exception.UsernameNotFoundException;
import com.masai.model.Event;
import com.masai.service.EventService;

@RestController
public class EventController {
		
	@Autowired
	EventService eservice;
	
	@PostMapping("/masaicalendar/event")
	public ResponseEntity<Event> createEventHandler(@RequestBody Event event, @PathVariable String email) throws UsernameNotFoundException{
		Event e= eservice.createEvent(event, email);
		return new ResponseEntity<Event>(e,HttpStatus.CREATED);
	}
	
	@PutMapping("/masaicalendar/event/{id}")
	public ResponseEntity<Event> updateEventHandler(@RequestBody Event event) throws EventException{
		return new ResponseEntity<Event>(eservice.updateEvent(event),HttpStatus.OK);
	}
	
	@DeleteMapping("/masaicalendar/event/{id}")
	public ResponseEntity<String> deleteEventHandler(@PathVariable Integer id) throws EventException{
		return new ResponseEntity<String>(eservice.deleteEvent(id),HttpStatus.OK);
	}
	
		
	
	
}
