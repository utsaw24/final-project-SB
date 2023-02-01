package com.axis.lms.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.lms.exception.InternalJobAlreadyExistsException;
import com.axis.lms.exception.InternalJobNotFoundException;
import com.axis.lms.model.InternalJob;
import com.axis.lms.repository.InternalJobRepository;




@Service
public class InternalJobImpl implements InternalJobService {
	
	@Autowired
	private InternalJobRepository internalJobRepository;

	@Override
	public InternalJob getInternalJobById(String jobId) {
		 Optional<InternalJob> ij = internalJobRepository.findById(jobId);
	     if(ij.isPresent()) {
	    	 return ij.get();
	     }
		throw new InternalJobNotFoundException("ID: " + jobId + " is Not Found");
	}

	@Override
	public List<InternalJob> getInternalJobs() {
		// TODO Auto-generated method stub
		return (List<InternalJob>) internalJobRepository.findAll();
	}

	@Override
	public void addInternalJob(InternalJob internalJob) {
		if(internalJobRepository.checkIfInternalJobAlreadyExists(internalJob.getJobId()) != 0) {
			 throw new InternalJobAlreadyExistsException("job"+"" +internalJob.getJobId()+" "+" already exists"); 
		}
		internalJobRepository.save(internalJob);

	}

	@Override
	public void deleteInternalJobById(String jobId) {
		// TODO Auto-generated method stub
		internalJobRepository.deleteById(jobId);

	}
	
    @Transactional
	@Override
	public InternalJob updateInternalJobById(String jobId, InternalJob internalJob) {
		// TODO Auto-generated method stub
		InternalJob toUpdate = internalJobRepository.findById(jobId).get();
		toUpdate.setJobName(internalJob.getJobName());
		toUpdate.setJobType(internalJob.getJobType());
		toUpdate.setJobDescription(internalJob.getJobDescription());

		return internalJobRepository.save(toUpdate);
	}

		
		
		
    }
