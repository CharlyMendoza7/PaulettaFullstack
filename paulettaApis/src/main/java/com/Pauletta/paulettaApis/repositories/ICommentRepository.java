package com.Pauletta.paulettaApis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Pauletta.paulettaApis.models.Comment;

@Repository
public interface  ICommentRepository extends JpaRepository<Comment, Integer> {

	
	
}
