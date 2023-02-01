package com.axis.lms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.lms.exception.SupportTeamAlreadyExistsException;
import com.axis.lms.exception.SupportTeamNotFoundException;
import com.axis.lms.model.SupportTeam;
import com.axis.lms.repository.SupportTeamRepository;



@Service
public class SupportTeamServiceImpl implements SupportTeamService{

	
	@Autowired
	private SupportTeamRepository supportTeamRepository;
	
	
	@Override
	public List<SupportTeam> getAllSupportTeams() {
		
		return (List<SupportTeam>) supportTeamRepository.findAll();
	}

	@Override
	public SupportTeam getSupportTeamById(String supportTeamId) {
	    Optional<SupportTeam> team = supportTeamRepository.findById(supportTeamId);
	     if(team.isPresent()) {
	    	 return team.get();
	     }
		throw new SupportTeamNotFoundException("ID: " + supportTeamId + " is Not Found");
	}

	@Override
	public void addSupportTeam(SupportTeam supportTeam) {
	if(supportTeamRepository.checkIfSupportTeamAlreadyExists(supportTeam.getSupportTeamId()) != 0) {
		 throw new SupportTeamAlreadyExistsException("support team"+"" +supportTeam.getSupportTeamId()+" "+" already exists"); 
	}
	supportTeamRepository.save(supportTeam);
		
	}

	@Override
	public void deleteSupportById(String supportTeamId) {
		supportTeamRepository.deleteById( supportTeamId);
		}

	@Override
	public void updateSupportTeam(String supportTeamId, SupportTeam updatedSupportTeam) {
		supportTeamRepository.updateSupportTeam(supportTeamId, updatedSupportTeam.getSupportTeamName(), updatedSupportTeam. getSupportTeamEmail(),
				updatedSupportTeam.getSupportTeamMobileNo(),updatedSupportTeam.getSupportTeamDesignation());
	}

	}

		
	
	
	


