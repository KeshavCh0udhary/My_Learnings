package com.masai.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.dao.EventRepo;
import com.masai.dao.UserRepo;
import com.masai.exception.EventException;
import com.masai.exception.UserException;
import com.masai.model.Event;
import com.masai.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo urepo;
	
	@Autowired
	private EventRepo erepo;
	
	@Override
	public User registerUser(User user) throws UserException {
		Optional<User> opt= urepo.findById(user.getEmail());
		if(opt.isPresent()) {
			throw new UserException("Email Already Exist");
		}
		User u= urepo.save(user);
		if(u==null) {
			throw new UserException("User Not Registered Successfully");
		}
		return u;
	}

	@Override
	public User updateUser(User user) throws UserException {
		Optional<User> opt= urepo.findById(user.getEmail());
		if(opt.isPresent()) {
			return urepo.save(user);
		}
		else
		throw new UserException("No User Found with given email id");
	}
	
	@Override
	public List<Event> getAllEvent(String eventType) throws EventException{
		List<Event> listOfEvents=erepo.findByEventType(eventType);
		if(listOfEvents.size()==0) {
			throw new EventException("No Event with given type found");
		}
		return listOfEvents;
	}

}
