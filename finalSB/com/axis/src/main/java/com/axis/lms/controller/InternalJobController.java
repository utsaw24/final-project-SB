package com.axis.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.lms.model.InternalJob;
import com.axis.lms.services.InternalJobService;


//@CrossOrigin("http://localhost:3000/")
@RestController
public class InternalJobController {
	@Autowired
	private InternalJobService internalJobService;
	
	@GetMapping("/internalJob/{jobId}")
	public InternalJob getInternalJobById(@PathVariable String jobId) {
		return internalJobService.getInternalJobById(jobId);
	}
	
	@GetMapping("/internalJobs")
	public List<InternalJob> getInternalJobs(){
		return internalJobService.getInternalJobs();
	}
	
	@PostMapping("/internalJob")
	public ResponseEntity<String> addInternalJob(@RequestBody InternalJob internalJob){
		internalJobService.addInternalJob(internalJob);
		return new ResponseEntity<String>("InternalJob added successfully..",HttpStatus.OK);
	}
	
	@DeleteMapping("/internalJob/{jobId}")
	public ResponseEntity<String> deleteInternalJobById(@PathVariable String jobId){
		internalJobService.deleteInternalJobById(jobId);
		return new ResponseEntity<String>("InternalJob deleted successfully..",HttpStatus.OK);
	}
	
	@PutMapping("/internalJob/{jobId}")
	public InternalJob updateInternaalJob(@PathVariable String jobId, @RequestBody InternalJob internalJob){
		return internalJobService.updateInternalJobById(jobId, internalJob);
	}	
	
}
