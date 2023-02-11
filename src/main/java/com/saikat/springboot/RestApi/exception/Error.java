package com.saikat.springboot.RestApi.exception;

import java.time.LocalDate;

public class Error {
	private LocalDate timestap;
	private String message;
	private String details;
	public Error(LocalDate timestap, String message, String details) {
		super();
		this.timestap = timestap;
		this.message = message;
		this.details = details;
	}
	public LocalDate getTimestap() {
		return timestap;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}
	
	
	
	

}
