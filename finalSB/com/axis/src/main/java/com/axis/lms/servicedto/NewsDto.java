package com.axis.lms.servicedto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class NewsDto {

	private int newsId;
	private String newsName;
	private String content;
	private Date dateTime;
	private List<CommentDto> commentDto = new ArrayList<>();
	
	public NewsDto() {
	}

	public NewsDto(int newsId, String newsName, String content, Date dateTime, List<CommentDto> commentDto) {
		super();
		this.newsId = newsId;
		this.newsName = newsName;
		this.content = content;
		this.dateTime = dateTime;
		this.commentDto = commentDto;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getNewsName() {
		return newsName;
	}

	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public List<CommentDto> getComments() {
		return commentDto;
	}

	public void setComments(List<CommentDto> commentDto) {
		this.commentDto = commentDto;
	}
	
	
	
	
}