package com.axis.lms.servicedto;

import java.util.Date;


public class CommentDto {

	private int commentId;
	private String empId;
	private String message;
	private Date dateTime;
	
	
	public CommentDto() {
	}


	public CommentDto(int commentId, String empId, String message, Date dateTime) {
	//	super();
		this.commentId = commentId;
		this.empId = empId;
		this.message = message;
		this.dateTime = dateTime;
	}


	public int getCommentId() {
		return commentId;
	}


	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Date getDateTime() {
		return dateTime;
	}


	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	
	
}
