package com.axis.lms.exception;

public class InternalJobAlreadyExistsException  extends RuntimeException {

	private static final long serialVersionUID = 8437097939095760927L;
	public InternalJobAlreadyExistsException() {
		super();
	}

	public InternalJobAlreadyExistsException(String message) {
		super(message);
	}


}
