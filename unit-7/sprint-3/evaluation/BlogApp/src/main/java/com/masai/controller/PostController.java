package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.PostException;
import com.masai.model.Post;
import com.masai.service.PostService;

@RestController
public class PostController {
	
	@Autowired
	PostService pservice;
	
	@PostMapping("/posts")
	public ResponseEntity<Post> createPostHandler(@Valid @RequestBody Post post){
		Post createpost = pservice.createPost(post);
		return new ResponseEntity<Post>(createpost,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/posts/{id}")
	public ResponseEntity<String> deletePostHandler(@PathVariable Integer id) throws PostException{
		String p = pservice.deletePost(id); 
		return new ResponseEntity<String>(p,HttpStatus.OK);
	}
	
	@GetMapping("/posts/{id}")
	public ResponseEntity<Post> getPostById(@PathVariable Integer id)throws PostException{
		Post getpost= pservice.getPost(id);
		return new ResponseEntity<Post> (getpost, HttpStatus.OK);
	}
	
	
	@PutMapping("/posts")
	public ResponseEntity<Post> updatePostHandler(@RequestBody Post post) throws PostException{
		Post updatepost= pservice.updatePost(post);
		return new ResponseEntity<Post>(updatepost, HttpStatus.OK);
	}
	
	@GetMapping("/posts")
	public ResponseEntity<List<Post>> getAllPost() throws PostException{
		List<Post> allposts= pservice.getAllPost();
		
		return new ResponseEntity<List<Post>>(allposts,HttpStatus.OK);
	}
	
}
