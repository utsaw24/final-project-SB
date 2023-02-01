package com.axis.lms.services;

import org.springframework.web.multipart.MultipartFile;

import com.axis.lms.model.Document;



public interface DocumentService {

Document getDocumentById(String documentId);
	void addDocument(String documentId, MultipartFile file);
	
}
