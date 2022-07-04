package com.np.studentManagement.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler{
	
	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<ErrorDetails> ResourceNotFound(ResourceNotFound resourceNotFound)
	{
		ErrorDetails error=new ErrorDetails(resourceNotFound.getMessage(), "NP100");
		return new ResponseEntity<ErrorDetails>(error, HttpStatus.NOT_FOUND);
	}

}
