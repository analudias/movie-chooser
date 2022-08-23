package com.analudias.moviechooser.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
public class ControllerExceptionHandler {
	
	@ExceptionHandler(HttpClientErrorException.class)
	public ResponseEntity<StandardError> movieNotFound(HttpClientErrorException e, HttpServletRequest request) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError();
		err.setTimestamp(Instant.now());
		err.setStatus(status.value());
		err.setError("Erro ao buscar filme. Pesquise novamente.");
		err.setPath(request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}

}
