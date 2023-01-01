package com.masai.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Event;
import com.masai.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{
		
}
