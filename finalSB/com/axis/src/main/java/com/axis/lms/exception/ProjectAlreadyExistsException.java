package com.axis.lms.exception;

public class ProjectAlreadyExistsException extends RuntimeException{

	
	private static final long serialVersionUID = -9019813980527886058L;
	
	
	public  ProjectAlreadyExistsException() {
		super();
	}

	public  ProjectAlreadyExistsException(String message) {
		super(message);
	}
	

}
