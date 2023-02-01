package com.axis.lms.services;

import java.util.List;

import com.axis.lms.model.Project;


public interface ProjectService {

	Project getProjectById(String projectId);
	List<Project> getAllProject();
	void addProject(Project project);
	void deleteProjectById(String projectId);
	void updateProjectById(String projectId, Project project);

}
