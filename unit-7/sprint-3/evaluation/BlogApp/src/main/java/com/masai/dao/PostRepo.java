package com.masai.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.masai.model.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer>{
		
}
