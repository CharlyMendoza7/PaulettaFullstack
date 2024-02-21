package com.Pauletta.paulettaApis.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Comments")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private LocalDate date;
	
	@Column
	private String user;
	
	@Column
	private String commentary;

	public Comment() {}
	
	public Comment(int id, LocalDate date, String user, String commentary) {
		super();
		this.id = id;
		this.date = date;
		this.user = user;
		this.commentary = commentary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getCommentary() {
		return commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", date=" + date + ", user=" + user + ", commentary=" + commentary + "]";
	}
	
	
	
}
