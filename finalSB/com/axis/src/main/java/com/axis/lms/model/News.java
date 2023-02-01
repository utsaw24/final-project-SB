package com.axis.lms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class News {

	@Id
	@GeneratedValue
    private int newsId;
	private String newsName;
	private String content;
	private Date dateTime;
	
	
	

	@OneToMany(mappedBy = "news",cascade = CascadeType.ALL)
	private List<Comment> comments=new ArrayList<>();

	public News() {
		
	}

	public News(int newsId, String newsName, String content, Date dateTime, List<Comment> comments) {
	
		this.newsId = newsId;
		this.newsName = newsName;
		this.content = content;
		this.dateTime = dateTime;
		this.comments = comments;
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

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", newsName=" + newsName + ", content=" + content + ", dateTime=" + dateTime
				+ ", comments=" + comments + "]";
	}

	
	
}