package com.axis.lms.services;

import com.axis.lms.model.Comment;

public interface CommentService {
	void addComment(Comment comment,int newsId);
	void deleteComment(int commentId);
	void updateComment(int commentId);
	
}
