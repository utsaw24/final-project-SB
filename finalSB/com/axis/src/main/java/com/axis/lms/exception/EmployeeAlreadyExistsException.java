package com.axis.lms.exception;

public class EmployeeAlreadyExistsException extends RuntimeException {
	
	private static final long serialVersionUID = 5188450836745194309L;

	public EmployeeAlreadyExistsException() {
		super();
	}

	public EmployeeAlreadyExistsException(String message) {
		super(message);
	}

}
