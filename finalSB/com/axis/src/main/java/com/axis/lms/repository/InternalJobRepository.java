package com.axis.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.axis.lms.model.InternalJob;


@Repository
public interface InternalJobRepository extends JpaRepository <InternalJob, String>{

	@Transactional
	@Query("select count(ij) from InternalJob ij where ij.jobId=:jobId")
	long checkIfInternalJobAlreadyExists(@Param("jobId") String jobId);
	


	@Transactional
	@Modifying
	@Query("update InternalJob ij set ij.jobName=:jobName, ij.jobType=:jobType, ij.jobDescription=:jobDescription where ij.jobId=:jobId")
	void InternalJobupdate(@Param("jobId") String jobId, @Param("jobName") String jobName, @Param("jobType") String jobType, @Param("jobDescription") String jobDescription);

}
