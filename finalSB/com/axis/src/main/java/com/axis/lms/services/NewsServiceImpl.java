package com.axis.lms.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.lms.model.News;
import com.axis.lms.repository.NewsRepository;
import com.axis.lms.servicedto.NewsDto;


@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsRepository newsRepository;
	
	@Autowired
	private ModelMapper modelmapper;

	@Override
	public List<NewsDto> getAllNews() {
		List<News> allFeeds = (List<News>) newsRepository.findAll();
		 List<NewsDto> feedDtos = allFeeds.stream().map((feed) -> this.modelmapper.map(feed, NewsDto.class)).collect(Collectors.toList());
		 return feedDtos;
		
		
	}
		
	public NewsDto getNewsById(int newsId) {
			 News news = newsRepository.findById(newsId).get();
			 NewsDto newsDto = modelmapper.map(news, NewsDto.class);
			 return newsDto;
		
	}

	

	@Override
	public void addNews(News news) {
		// TODO Auto-generated method stub
		newsRepository.save(news);
	}

	@Override
	public void deleteNewsById(int newsId) {
		newsRepository.deleteById(newsId);
		
	}

	@Override
	public void updateNewsById(int newsId, News updatedNews) {
		// TODO Auto-generated method stub
		
	}
}