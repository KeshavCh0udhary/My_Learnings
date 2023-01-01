package com.masai.service;

import com.masai.exception.EventException;
import com.masai.exception.UsernameNotFoundException;
import com.masai.model.Event;

public interface EventService {
	
	public Event updateEvent(Event event)throws EventException;
	public String deleteEvent(Integer id) throws EventException;	
	public Event createEvent(Event event, String userEmail) throws UsernameNotFoundException;

}
