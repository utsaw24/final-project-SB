package com.axis.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.lms.model.Project;
import com.axis.lms.services.ProjectService;




@RestController
public class projectController {

	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/view-project/{projectId}")
	public Project getProjectById(@PathVariable String projectId) {
		return projectService.getProjectById(projectId);
	}
	
	@GetMapping("/projects")
	public List<Project> getAllProject(){
		return projectService.getAllProject();
	}
	
	@PostMapping("/add-project")
	public ResponseEntity<String> addProject(@RequestBody Project project){
		projectService.addProject(project);
		return new ResponseEntity<String>("Project Added Successfully..",HttpStatus.OK);
	}
	
	@DeleteMapping("/delete-project/{projectId}")
	public ResponseEntity<String> deleteProjectById(@PathVariable String projectId){
		projectService.deleteProjectById(projectId);
		return new ResponseEntity<String>("Project deleted Successfully..",HttpStatus.OK);
	}
	
	@PutMapping("/update-project/{projectId}")
	public ResponseEntity<String> updateProjectInfo(@PathVariable String projectId, @RequestBody Project project){
		projectService.updateProjectById(projectId, project);
		return new ResponseEntity<String>("Project Updated Successfully..",HttpStatus.OK);
	}	
}
