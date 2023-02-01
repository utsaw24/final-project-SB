package com.axis.lms.exception;

public class SupportTeamNotFoundException extends RuntimeException{


	private static final long serialVersionUID = -3698709753707596721L;
	
	public SupportTeamNotFoundException() {
		super();
	}
	
	public SupportTeamNotFoundException(String message) {
		super(message);
	}
}
