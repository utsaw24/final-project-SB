package com.axis.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.lms.model.Document;


@Repository
public interface DocumentRepository extends JpaRepository<Document, String> {

}
