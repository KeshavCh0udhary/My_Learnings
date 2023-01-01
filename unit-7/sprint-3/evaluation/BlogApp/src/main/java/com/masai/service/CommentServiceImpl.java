package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.CommentRepo;
import com.masai.exceptions.CommentException;
import com.masai.model.Comment;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	CommentRepo crepo;
	
	@Override
	public Comment createComment(Comment comment) {
		return crepo.save(comment);
	}

	@Override
	public String deleteComment(int id) throws CommentException {
		Optional<Comment> c= crepo.findById(id);
		if(c.isPresent()) {
			crepo.deleteById(id);
			return "Comment Deleted";
		}
		else {
			throw new CommentException("No comment exist");
		}
	}

	@Override
	public Comment updateComment(Comment comment) throws CommentException {
		Optional<Comment> c= crepo.findById(comment.getCommentId());
		if(c.isPresent()) {
			return crepo.save(comment);
		}
		else {
			throw new CommentException("No comment exist");
		}
	}

	@Override
	public Comment getComment(Integer id) throws CommentException {
		Optional<Comment> c= crepo.findById(id);
		if(c.isPresent()) {
			return c.get();
		}
		else {
			throw new CommentException("No comment exist with this id");
		}
	}

	@Override
	public List<Comment> getAllComment() throws CommentException {	
		List<Comment> c= crepo.findAll();
		return c;
	}




	
}
