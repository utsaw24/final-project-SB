package com.axis.lms.model;



import java.util.Arrays;

import javax.persistence.*;

@Entity
public class Document {
   
	@Id
    private String documentId;
    private String documentName;
    private String documentType;
    @Lob
    private byte[] documentData;

    public Document() {

    }

	public Document(String documentId, String documentName, String documentType, byte[] documentData) {
	
		this.documentId = documentId;
		this.documentName = documentName;
		this.documentType = documentType;
		this.documentData = documentData;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public byte[] getDocumentData() {
		return documentData;
	}

	public void setDocumentData(byte[] documentData) {
		this.documentData = documentData;
	}

	
}