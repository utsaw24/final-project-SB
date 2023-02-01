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

import com.axis.lms.model.SupportTeam;
import com.axis.lms.services.SupportTeamService;


@RestController
public class SupportTeamController {


      @Autowired
		private SupportTeamService supportTeamService;
    

  	@GetMapping("/supportTeams")
  	public List<SupportTeam> getAllFaculties() {
  		return supportTeamService.getAllSupportTeams();
  	}

  	@GetMapping("/view-supportTeam/{supportTeamId}")
  	public SupportTeam getSupportTeamById(@PathVariable String supportTeamId) {
  		return supportTeamService.getSupportTeamById(supportTeamId);
  	}

  	@PostMapping("/add-supportTeam")
  	public ResponseEntity<String> addSupportTeam(@RequestBody SupportTeam supportTeam) {
  		supportTeamService.addSupportTeam(supportTeam);
  		return new ResponseEntity<>("Added....", HttpStatus.OK);
  	}

  	@PutMapping("/update-supportTeam/{supportTeamId}")
  	public ResponseEntity<String> updateSupportTeam(@PathVariable String supportTeamId, @RequestBody SupportTeam updatedSupportTeam) {
  		supportTeamService.updateSupportTeam(supportTeamId, updatedSupportTeam);
  		return new ResponseEntity<>("Updated.........", HttpStatus.OK);
  	}
  	
  	
  	
  	@DeleteMapping("/delete-supportTeam/{supportTeamId}")
  	public ResponseEntity<String> deleteSupportTeam(@PathVariable String supportTeamId) {
  		supportTeamService.getSupportTeamById(supportTeamId);
  		return new ResponseEntity<>("Deleted with Id " +"  "+supportTeamId, HttpStatus.OK);
  	}
	

}
