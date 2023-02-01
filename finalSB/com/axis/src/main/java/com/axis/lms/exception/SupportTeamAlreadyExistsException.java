package com.axis.lms.exception;

public class SupportTeamAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 8437097939095760927L;
	public SupportTeamAlreadyExistsException() {
		super();
	}

	public SupportTeamAlreadyExistsException(String message) {
		super(message);
	}

}
