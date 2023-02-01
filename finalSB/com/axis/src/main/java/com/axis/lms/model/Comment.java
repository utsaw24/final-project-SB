package com.axis.lms.model;

import java.util.Date;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Comment {
	
	@Id
	private int commentId;
	private String empId;
	private String message;
	private Date dateTime;
	

	@ManyToOne
	private News news;
	
	
	public Comment() {
	}

	public Comment(int commentId, String empId, String message, Date dateTime) {
		//super();
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

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", empId=" + empId + ", message=" + message + ", dateTime="
				+ dateTime + "]";
	}
	
	
}
