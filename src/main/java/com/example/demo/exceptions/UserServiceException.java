package com.example.demo.exceptions;

public class UserServiceException extends RuntimeException {

	private static final long serialVersionUID = 3872663014244687316L;

	
	public UserServiceException (String message) {
		super(message);
	}
	
	
}
