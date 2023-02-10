package com.ivipech.tienda.rest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ControllerAdvice
public class ItemRestExceptionHandler {
		
		@ExceptionHandler
		public ResponseEntity<ItemErrorResponse> hendleException(ItemNotFoundException exc){
			
			
			ItemErrorResponse error = new ItemErrorResponse(
					  HttpStatus.NOT_FOUND.value(),
					  exc.getMessage(),
					  System.currentTimeMillis());
			
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
		
		@ExceptionHandler
		public ResponseEntity<ItemErrorResponse> handleException(Exception exc){
			
			ItemErrorResponse error = new ItemErrorResponse(
					HttpStatus.BAD_REQUEST.value(),
					exc.getMessage(),
					System.currentTimeMillis());
			
			return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
		}
	
}
