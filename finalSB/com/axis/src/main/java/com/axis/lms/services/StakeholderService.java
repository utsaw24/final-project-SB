package com.axis.lms.services;

import java.util.List;

import com.axis.lms.model.Stakeholder;




public interface StakeholderService {
	
	
	Stakeholder getStakeholderById(String stakeholderId);
	List<Stakeholder> getStakeholders();
	void addStakeholder (Stakeholder stakeholder);
	void deleteStakeholderById(String stakeholderId);
	public Stakeholder updateStakeholder(String stakeholderId,Stakeholder stakeholder);


}



