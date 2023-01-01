package com.masai.service;

import java.util.List;

import com.masai.exceptions.PostException;
import com.masai.model.Post;

public interface PostService {

		public Post createPost(Post post);
		public String deletePost(int id) throws PostException;
		public Post updatePost(Post post) throws PostException;
		public Post getPost(Integer id) throws PostException;
		public List<Post> getAllPost() throws PostException;
}
