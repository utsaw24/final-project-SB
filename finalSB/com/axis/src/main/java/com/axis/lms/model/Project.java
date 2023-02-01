package com.axis.lms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {

	@Id
	private String projectId;
	private String projectName;
	private String projectDescription;
	private String projectOwnerName;
	private String projectFlowChart;

	public Project() {
		
	}

	public Project(String projectId, String projectName, String projectDescription, String projectOwnerName,
			String projectFlowChart) {
		
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.projectOwnerName = projectOwnerName;
		this.projectFlowChart = projectFlowChart;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getProjectOwnerName() {
		return projectOwnerName;
	}

	public void setProjectOwnerName(String projectOwnerName) {
		this.projectOwnerName = projectOwnerName;
	}

	public String getProjectFlowChart() {
		return projectFlowChart;
	}

	public void setProjectFlowChart(String projectFlowChart) {
		this.projectFlowChart = projectFlowChart;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectDescription="
				+ projectDescription + ", projectOwnerName=" + projectOwnerName + ", projectFlowChart="
				+ projectFlowChart + "]";
	}
	
	
}