package com.axis.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.lms.model.Stakeholder;
import com.axis.lms.services.StakeholderService;



@RestController
//@CrossOrigin("http://localhost:3000/")
public class StakeholderController {
	@Autowired
	private StakeholderService stakeholderService;
	
	@GetMapping("/stakeholder/{stakeholderId}")
	public Stakeholder getStakeholderById(@PathVariable String stakeholderId) {
		return stakeholderService.getStakeholderById(stakeholderId);
	}
	
	@GetMapping("/stakeholders")
	public List<Stakeholder> getStakeholders(){
		return stakeholderService.getStakeholders();
	}
	
	@PostMapping("/stakeholder")
	public ResponseEntity<String> addStakeholder(@RequestBody Stakeholder stakeholder){
		stakeholderService.addStakeholder(stakeholder);
		return new ResponseEntity<String>("Stakeholder added successfully..",HttpStatus.OK);
	}
	
	@DeleteMapping("/stakeholder/{stakeholderId}")
	public ResponseEntity<String> deleteStakeholderById(@PathVariable String stakeholderId){
		stakeholderService.deleteStakeholderById(stakeholderId);
		return new ResponseEntity<String>("Stakeholder deleted successfully..",HttpStatus.OK);
	}
	
	@PutMapping("/stakeholder/{stakeholderId}")
	public Stakeholder updateStakeholder(@PathVariable String stakeholderId, @RequestBody Stakeholder stakeholder){
		return stakeholderService.updateStakeholder(stakeholderId, stakeholder);
	}	

}