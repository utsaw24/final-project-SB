package com.axis.lms.services;

import java.util.List;

import com.axis.lms.model.News;
import com.axis.lms.servicedto.NewsDto;



public interface NewsService {

	List<NewsDto> getAllNews();
	NewsDto getNewsById(int newsId);
	void addNews(News news);
	void deleteNewsById(int newsId);
	void updateNewsById(int newsId, News updatedNews);
}
