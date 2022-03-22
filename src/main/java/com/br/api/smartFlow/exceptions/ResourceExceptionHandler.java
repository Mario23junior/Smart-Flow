package com.br.api.smartFlow.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {
  
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardErro> objectErro(ObjectNotFoundException e, HttpServletRequest request) {
		StandardErro erro = new StandardErro(
				HttpStatus.NOT_FOUND.value(), 
				e.getMessage(),
				System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
}
