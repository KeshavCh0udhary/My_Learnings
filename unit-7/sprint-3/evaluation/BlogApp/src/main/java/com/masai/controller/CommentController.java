package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.masai.exceptions.CommentException;
import com.masai.model.Comment;
import com.masai.service.CommentService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class CommentController {
	@Autowired
	CommentService cservice;
	
	@PostMapping("/comments")
	public ResponseEntity<Comment> createCommentHandler(@RequestBody Comment comment){
		Comment createComment= cservice.createComment(comment);
		return new ResponseEntity<Comment>(createComment,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/comments/{id}")
	public ResponseEntity<String> deleteCommentHandler(@PathVariable Integer id) throws CommentException{
		String p = cservice.deleteComment(id); 
		return new ResponseEntity<String>(p,HttpStatus.OK);
	}
	
	@GetMapping("/comments/{id}")
	public ResponseEntity<Comment> getPostById(@PathVariable Integer id)throws CommentException{
		Comment getcomment= cservice.getComment(id);
		return new ResponseEntity<Comment> (getcomment, HttpStatus.OK);
	}
	
	
	@PutMapping("/comments")
	public ResponseEntity<Comment> updateCommentHandler(@RequestBody Comment comment) throws CommentException{
		Comment updatecomment= cservice.updateComment(comment);
		return new ResponseEntity<Comment>(updatecomment, HttpStatus.OK);
	}
	
	@GetMapping("/comments")
	public ResponseEntity<List<Comment>> getAllComments() throws CommentException{
		List<Comment> allposts= cservice.getAllComment();
		
		return new ResponseEntity<List<Comment>>(allposts,HttpStatus.OK);
	}
	
	
}
