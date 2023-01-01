package com.masai.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Event;


@Repository
public interface EventRepo extends JpaRepository<Event, Integer> {
	public List<Event> findByEventType(String eventType);
}
