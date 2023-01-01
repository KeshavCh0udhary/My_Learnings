package com.masai.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.EventRepo;
import com.masai.dao.UserRepo;
import com.masai.exception.EventException;
import com.masai.exception.UsernameNotFoundException;
import com.masai.model.Event;
import com.masai.model.User;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private UserRepo urepo;
	
	@Autowired
	private EventRepo erepo;
	
	@Override
	public Event updateEvent(Event event) throws EventException {
		Optional<Event> opt = erepo.findById(event.getEventId());
		if(opt.isPresent()) {
			return erepo.save(event);
		}
		else {
			throw new EventException("No Event found");
		}
	}

	@Override
	public String deleteEvent(Integer id) throws EventException {
		Optional<Event> opt= erepo.findById(id);
		if(opt.isPresent()) {
			erepo.deleteById(id);
			return "Event Deleted Successfully";
		}
		throw new EventException("No event found with given id");
	}

	@Override
	public Event createEvent(Event event, String userEmail) throws UsernameNotFoundException {
	Optional<User> opt= urepo.findById(userEmail);
		
		if(opt.isPresent()) {
		User u = opt.get()	;
		u.getEventList().add(event);
		urepo.save(u);
		event.setUser(u);
		return erepo.save(event);
		}
		else {
			throw new UsernameNotFoundException();
		}
	}

}
