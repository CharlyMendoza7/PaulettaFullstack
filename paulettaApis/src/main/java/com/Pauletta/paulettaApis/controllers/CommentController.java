package com.Pauletta.paulettaApis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Pauletta.paulettaApis.models.Comment;
import com.Pauletta.paulettaApis.services.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {

	@Autowired
	CommentService commentService;
	
	@GetMapping
	public List<Comment> getAllComments(){
		
		return commentService.getAllComments();
		
	}
	
	@PostMapping("/insertComment")
	public Comment insertComment(@RequestBody Comment comment) {
		
		return commentService.insertComment(comment);
		
	}
	
	@PutMapping("/updateCommentById")
	@ResponseBody
	public Comment updateComment(@RequestBody Comment comment, @RequestParam Integer id) {
		
		return commentService.updateCommentById(comment, id);
		
	}
	
	@DeleteMapping("/deleteCommentById")
	@ResponseBody
	public String deleteCommentById(@RequestParam Integer id) {
		Boolean response = commentService.deleteCommentById(id);
		if(response) {
			return "The comment with id: "+id+" has been deleted";
		}else {
			return "Id: "+id+" does not exist";
		}
	}
	
}
