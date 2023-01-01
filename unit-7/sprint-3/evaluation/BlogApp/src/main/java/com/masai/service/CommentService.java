package com.masai.service;

import java.util.List;

import com.masai.exceptions.CommentException;
import com.masai.model.Comment;

public interface CommentService {
	
	public Comment createComment(Comment comment);
	public String  deleteComment(int id) throws CommentException;
	public Comment updateComment(Comment comment) throws CommentException;
	public Comment getComment(Integer id) throws CommentException;
	public List<Comment> getAllComment()throws CommentException;
}
