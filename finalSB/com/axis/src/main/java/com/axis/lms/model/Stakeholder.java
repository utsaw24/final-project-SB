package com.axis.lms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stakeholder {
	
	@Id
	private String stakeholderId;
	private String stakeholderName;
	private long stakeholderMobileNo;
	private String stakeholderEmail;
	
	public Stakeholder() {
		
	}

	public Stakeholder(String stakeholderId, String stakeholderName, long stakeholderMobileNo, String stakeholderEmail) {
		this.stakeholderId = stakeholderId;
		this.stakeholderName = stakeholderName;
		this.stakeholderMobileNo = stakeholderMobileNo;
		this.stakeholderEmail = stakeholderEmail;
	}

	public String getStakeholderId() {
		return stakeholderId;
	}

	public void setStakeholderId(String stakeholderId) {
		this.stakeholderId = stakeholderId;
	}

	public String getStakeholderName() {
		return stakeholderName;
	}

	public void setStakeholderName(String stakeholderName) {
		this.stakeholderName = stakeholderName;
	}

	public long getStakeholderMobileNo() {
		return stakeholderMobileNo;
	}

	public void setStakeholderMobileNo(long stakeholderMobileNo) {
		this.stakeholderMobileNo = stakeholderMobileNo;
	}

	public String getStakeholderEmail() {
		return stakeholderEmail;
	}

	public void setStakeholderEmail(String stakeholderEmail) {
		this.stakeholderEmail = stakeholderEmail;
	}

	@Override
	public String toString() {
		return "Stakeholder [stakeholderId=" + stakeholderId + ", stakeholderName=" + stakeholderName
				+ ", stakeholderMobileNo=" + stakeholderMobileNo + ", stakeholderEmail=" + stakeholderEmail + "]";
	}

}
