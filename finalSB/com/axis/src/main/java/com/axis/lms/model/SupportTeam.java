package com.axis.lms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SupportTeam {
	
	@Id
	private String supportTeamId;
	private String supportTeamName;
	private String supportTeamEmail;
	private long supportTeamMobileNo;
	private String supportTeamDesignation;
	private String projectId;
	
	
	
	public SupportTeam() {
		
	}



	public SupportTeam(String supportTeamId, String supportTeamName, String supportTeamEmail, long supportTeamMobileNo,
			String supportTeamDesignation, String projectId) {
		super();
		this.supportTeamId = supportTeamId;
		this.supportTeamName = supportTeamName;
		this.supportTeamEmail = supportTeamEmail;
		this.supportTeamMobileNo = supportTeamMobileNo;
		this.supportTeamDesignation = supportTeamDesignation;
		this.projectId = projectId;
	}



	public String getSupportTeamId() {
		return supportTeamId;
	}



	public void setSupportTeamId(String supportTeamId) {
		this.supportTeamId = supportTeamId;
	}



	public String getSupportTeamName() {
		return supportTeamName;
	}



	public void setSupportTeamName(String supportTeamName) {
		this.supportTeamName = supportTeamName;
	}



	public String getSupportTeamEmail() {
		return supportTeamEmail;
	}



	public void setSupportTeamEmail(String supportTeamEmail) {
		this.supportTeamEmail = supportTeamEmail;
	}



	public long getSupportTeamMobileNo() {
		return supportTeamMobileNo;
	}



	public void setSupportTeamMobileNo(long supportTeamMobileNo) {
		this.supportTeamMobileNo = supportTeamMobileNo;
	}



	public String getSupportTeamDesignation() {
		return supportTeamDesignation;
	}



	public void setSupportTeamDesignation(String supportTeamDesignation) {
		this.supportTeamDesignation = supportTeamDesignation;
	}



	public String getProjectId() {
		return projectId;
	}



	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}



	@Override
	public String toString() {
		return "SupportTeam [supportTeamId=" + supportTeamId + ", supportTeamName=" + supportTeamName
				+ ", supportTeamEmail=" + supportTeamEmail + ", supportTeamMobileNo=" + supportTeamMobileNo
				+ ", supportTeamDesignation=" + supportTeamDesignation + ", projectId=" + projectId + "]";
	}
}