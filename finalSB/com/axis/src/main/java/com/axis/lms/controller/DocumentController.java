package com.axis.lms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.axis.lms.model.Document;
import com.axis.lms.services.DocumentService;

import java.util.Base64;


@RestController
public class DocumentController {

    
    @Autowired
    private DocumentService documentService;

    @GetMapping("/view-document/documentId")
    public ResponseEntity<byte[]> getDocumentById(@PathVariable String documentId) {
		Document doc = documentService.getDocumentById(documentId);
		return new ResponseEntity<>(Base64.getEncoder().encode(doc.getDocumentData()), HttpStatus.OK);
	}

   
    @PostMapping("/upload-document")
	public ResponseEntity<String> addDocument(@RequestParam("documentId") String documentId,
			@RequestParam("file") MultipartFile file) {
		documentService.addDocument(documentId, file);
		return new ResponseEntity<>("Document Uploaded Successfully", HttpStatus.OK);
	}

}
