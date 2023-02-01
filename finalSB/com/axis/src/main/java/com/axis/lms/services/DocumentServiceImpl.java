package com.axis.lms.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.axis.lms.exception.DocumentNotFoundException;
import com.axis.lms.exception.DocumentStorageException;
import com.axis.lms.model.Document;
import com.axis.lms.repository.DocumentRepository;



@Service
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	private DocumentRepository documentRepository;
	
	@Override
	public Document getDocumentById(String documentId) {
		// TODO Auto-generated method stub
	 return documentRepository.findById(documentId).orElseThrow(() -> new DocumentNotFoundException("Document do not Exist with Document ID: " + documentId));
	}

	@Override
	public void addDocument(String documentId, MultipartFile file) {
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		try {
			if(fileName.contains("..")) {
				throw new DocumentStorageException(" Invalid Path" + fileName);
			}
			Document document = new Document(documentId, fileName, file.getContentType(), file.getBytes());
			documentRepository.save(document);
		} catch(IOException e) {
			throw new DocumentStorageException("Could not store file " + fileName + ". Please try again!");
		}// TODO Auto-generated method stub
		
	}
	
	
	
}
