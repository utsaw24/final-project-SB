package com.axis.lms.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.axis.lms.model.News;


public interface NewsRepository extends CrudRepository<News, Integer>{
	
	@Modifying
	@Query("update News set newsName=?1, newsContent=?2, DateTime=?3 where newsId=?4")
	void updateNewsInfo(String newsName,String newsContent,Date dateTime,String newsId);

}
