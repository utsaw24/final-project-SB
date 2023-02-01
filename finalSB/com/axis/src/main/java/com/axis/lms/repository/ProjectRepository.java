package com.axis.lms.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.axis.lms.model.Project;


public interface ProjectRepository extends CrudRepository<Project, String> {
	
	@Modifying
	@Query("update Project set projectName=?1, projectDescription=?2, projectOwnerName=?3, projectFlowChart=?4 where projectId=?5")
	void updateProjectInfo(String projectName,String projectDescription,String projectOwnerName,String projectFlowChart,
			String projectId);
	
	

	@Transactional
	@Query("select count(p) from Project p where p.projectId=:projectId")
	long checkIfProjectAlreadyExists(@Param("projectId") String projectId);
	
}
