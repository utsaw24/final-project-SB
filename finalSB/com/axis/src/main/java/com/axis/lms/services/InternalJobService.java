package com.axis.lms.services;

import java.util.List;

import com.axis.lms.model.InternalJob;





public interface InternalJobService {
	
	InternalJob getInternalJobById(String jobId);
	List<InternalJob> getInternalJobs();
	void addInternalJob (InternalJob internalJob);
	void deleteInternalJobById(String jobId);
	public InternalJob updateInternalJobById(String jobId,InternalJob internalJob);

	


}
