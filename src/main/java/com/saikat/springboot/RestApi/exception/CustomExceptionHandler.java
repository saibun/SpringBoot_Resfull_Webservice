package com.saikat.springboot.RestApi.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.saikat.springboot.RestApi.users.UserNotFoundException;
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Error> handleAllException(Exception ex, WebRequest request) throws Exception{
		Error e=new Error(LocalDate.now(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<Error>(e,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Error> handleUserNotFoundException(Exception ex, WebRequest request) throws Exception{
		Error e=new Error(LocalDate.now(),ex.getMessage(),request.getContextPath());
		return new ResponseEntity<Error>(e,HttpStatus.NOT_FOUND);
	}

}
