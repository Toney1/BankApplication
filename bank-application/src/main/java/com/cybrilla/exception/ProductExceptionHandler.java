package com.cybrilla.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler 
{
	
	@ExceptionHandler(value = CustomerNotFoundException.class)
	public ResponseEntity<ErrorDetails> exception(CustomerNotFoundException exception) 
	{
		ErrorDetails error = new ErrorDetails();
		error.setErrorMessage(exception.getMessage());
		System.out.println(error.getErrorMessage());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	
	
	@ExceptionHandler(value = InSufficientFundsException.class)
	public ResponseEntity<ErrorDetails> exception(InSufficientFundsException exception) 
	{
		ErrorDetails error = new ErrorDetails();
		error.setErrorMessage(exception.getMessage());
		System.out.println(error.getErrorMessage());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

}
