package com.hdfc.capstone.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Bharath Kumar
 *
 * @CreatedDate 21-Apr-2023
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(InvalidEmployeeIdException.class)
	public ResponseEntity<String> handleEmployeeNotFoundException(InvalidEmployeeIdException ex){
		log.info(ex.getMessage());
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<String> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex){
		String message = "Please provide Employee Id in numbers only";
		log.info(message);
		return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
	}

}
