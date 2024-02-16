package com.Pauletta.paulettaApis.exceptions;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PaulettaExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<ErrorDetails> handleException(PaletaNotFoundException e){
		
		//log.info("Paleta no encontrada");
		
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setTimestamp(LocalDate.now());
		errorDetails.setMessage("Paleta no encontrada bro");
		
		return ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.contentType(MediaType.APPLICATION_PROBLEM_JSON)
				.body(errorDetails);
		
		
	}
	
}
