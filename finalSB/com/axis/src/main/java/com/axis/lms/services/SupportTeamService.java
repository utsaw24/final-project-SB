package com.axis.lms.services;

import java.util.List;

import com.axis.lms.model.SupportTeam;


public interface SupportTeamService {
	
	List<SupportTeam> getAllSupportTeams();
	SupportTeam getSupportTeamById(String supportTeamId);
	void addSupportTeam(SupportTeam supportTeam);
	void updateSupportTeam(String supportTeamId, SupportTeam updatedSupportTeam);
void deleteSupportById(String supportTeamId);
	
	

}
