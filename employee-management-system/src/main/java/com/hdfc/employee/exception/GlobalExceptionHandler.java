package com.hdfc.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 
 * @author Bharath Kumar
 *
 * @CreatedDate 21-Apr-2023
 */

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(InvalidEmployeeIdException.class)
	public ResponseEntity<String> handleEmployeeNotFoundException(InvalidEmployeeIdException ex){
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}

}
