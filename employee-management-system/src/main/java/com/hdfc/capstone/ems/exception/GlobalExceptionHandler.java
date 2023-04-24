package com.hdfc.capstone.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

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
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<String> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex){
		return new ResponseEntity<>("Please provide Employee Id in numbers only", HttpStatus.BAD_REQUEST);
	}

}
