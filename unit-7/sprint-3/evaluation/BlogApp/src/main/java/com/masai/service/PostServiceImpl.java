package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.PostRepo;
import com.masai.exceptions.PostException;
import com.masai.model.Post;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired
	PostRepo prepo;
	
	@Override 
	public Post createPost(Post post) {
		return prepo.save(post);
	}

	@Override
	public String deletePost(int id) throws PostException {
		Optional<Post> p = prepo.findById(id);
		if(p.isPresent()) {
		   prepo.deleteById(id);
		   return "Post Deleted Successfully";
		}
		else {
			throw new PostException("No post with this id found");
		}
	}

	@Override
	public Post updatePost(Post post) throws PostException {
		Optional<Post> p= prepo.findById(post.getPostid());
		if(p.isPresent()) {
			return prepo.save(post);
		}
		else {
			throw new PostException("The Post does not exist");
		}
	}


	@Override
	public List<Post> getAllPost() {
		List<Post> p = prepo.findAll();
		return p;
	}

	@Override
	public Post getPost(Integer id) throws PostException {
		Optional<Post> p = prepo.findById(id);
		if(p.isPresent()) {
			return p.get();
		}
		else {
			throw new PostException("No post with this id exist");
		}
	}
			
}
