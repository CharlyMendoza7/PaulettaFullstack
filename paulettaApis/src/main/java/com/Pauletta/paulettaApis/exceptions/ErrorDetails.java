package com.Pauletta.paulettaApis.exceptions;

import java.time.LocalDate;

public class ErrorDetails {

	private LocalDate timestamp;
	private String message;
	
	public ErrorDetails(){
		
	}
	
	public ErrorDetails(LocalDate timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
	}
	public LocalDate getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
