package com.Pauletta.paulettaApis.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Pauletta.paulettaApis.models.Comment;
import com.Pauletta.paulettaApis.repositories.ICommentRepository;

@Service
public class CommentService {
	
	@Autowired
	ICommentRepository commentRepository;
	
	public List<Comment> getAllComments(){
		
		return commentRepository.findAll();
		
	}
	
	public Comment insertComment(Comment comment) {
		
		comment.setDate(LocalDate.now());
		return commentRepository.save(comment);
		
	}
	
	public Comment updateCommentById(Comment request, Integer id) {
		
		Comment comment = commentRepository.findById(id).get();
		
		comment.setCommentary(request.getCommentary());
		comment.setDate(LocalDate.now());
		comment.setUser(request.getUser());
		
		return commentRepository.save(comment);
		
	}
	
	public Boolean deleteCommentById(Integer id) {
		try {
			commentRepository.deleteById(id);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
}
