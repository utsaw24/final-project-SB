package com.axis.lms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InternalJob {
	@Id
	private String jobId;
	private String jobName;
	private String jobType;
	private String jobDescription;
	
	public InternalJob() {
		
	}

	public InternalJob(String jobId, String jobName, String jobType, String jobDescription) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.jobType = jobType;
		this.jobDescription = jobDescription;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	@Override
	public String toString() {
		return "InternalJob [jobId=" + jobId + ", jobName=" + jobName + ", jobType=" + jobType + ", jobDescription="
				+ jobDescription + "]";
	}

	
	
}