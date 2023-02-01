package com.axis.lms.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.lms.exception.ProjectAlreadyExistsException;
import com.axis.lms.exception.ProjectNotFoundException;
import com.axis.lms.model.Project;
import com.axis.lms.repository.ProjectRepository;




@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public Project getProjectById(String projectId) {
		Optional<Project> projectOpt = projectRepository.findById(projectId);
		if(!projectOpt.isPresent())
			throw new ProjectNotFoundException("Project Not Found by Id "+projectId);
		return projectOpt.get();
	}

	@Override
	public List<Project> getAllProject() {
		
		return (List<Project>) projectRepository.findAll();
	}
	
	@Override
	public void addProject(Project project) {
		if(projectRepository.checkIfProjectAlreadyExists(project.getProjectId()) != 0) {
			 throw new ProjectAlreadyExistsException("project "+" " +project.getProjectId()+" "+" already exists"); 
		}
		projectRepository.save(project);
	}

	@Override
	public void deleteProjectById(String projectId) {
		Optional<Project> projectOpt = projectRepository.findById(projectId);
		if(!projectOpt.isPresent())
			throw new ProjectNotFoundException("Project Not Found by Id "+projectId);
		projectRepository.deleteById(projectId);;

	}

	@Transactional
	@Override
	public void updateProjectById(String projectId, Project project) {
		projectRepository.updateProjectInfo(project.getProjectName(),
											project.getProjectDescription(),
											project.getProjectOwnerName(), 
											project.getProjectFlowChart(), 
											project.getProjectId());

	}

}
