package com.komal.demo.ex;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(USER_NOT_FOUND_EXCEPTON.class)
	public ResponseEntity<ErrorMessage> handleUserNotFoundException(USER_NOT_FOUND_EXCEPTON ex) 
	{
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(),"USER_NOT_FOUND_EXCEPTON");
		return new ResponseEntity<>(errorMessage,HttpStatus.NOT_FOUND);
	}
}
