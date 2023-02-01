package com.axis.lms.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axis.lms.model.Comment;



@Repository
public interface CommentRepository extends CrudRepository<Comment,Integer>{

}
