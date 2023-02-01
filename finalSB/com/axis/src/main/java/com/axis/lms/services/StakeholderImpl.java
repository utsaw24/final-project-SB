package com.axis.lms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.lms.exception.StakeholderAlreadyExistsException;
import com.axis.lms.exception.StakeholderNotFoundException;
import com.axis.lms.model.Stakeholder;
import com.axis.lms.repository.StakeholderRepository;






@Service
public class StakeholderImpl implements StakeholderService {
	
	@Autowired
	private StakeholderRepository stakeholderRepository;

	@Override
	public Stakeholder getStakeholderById(String stakeholderId) {
		 Optional<Stakeholder> sh = stakeholderRepository.findById(stakeholderId);
	     if(sh.isPresent()) {
	    	 return sh.get();
	     }
		throw new StakeholderNotFoundException("ID: " + stakeholderId + " is Not Found");
	}

	@Override
	public List<Stakeholder> getStakeholders() {
		// TODO Auto-generated method stub
		return (List<Stakeholder>) stakeholderRepository.findAll();
	}

	@Override
	public void addStakeholder(Stakeholder stakeholder) {
		if(stakeholderRepository.checkIfStakeholderAlreadyExists(stakeholder.getStakeholderId()) != 0) {
			 throw new StakeholderAlreadyExistsException("stakeholder"+"" +stakeholder.getStakeholderId()+" "+" already exists"); 
		}
		stakeholderRepository.save(stakeholder);

	}

	@Override
	public void deleteStakeholderById(String stakeholderId) {
		stakeholderRepository.deleteById(stakeholderId);

	}

	@Override
	public Stakeholder updateStakeholder(String stakeholderId, Stakeholder stakeholder) {
		
		Stakeholder toUpdate = stakeholderRepository.findById(stakeholderId).get();
		toUpdate.setStakeholderName(stakeholder.getStakeholderName());
		toUpdate.setStakeholderMobileNo(stakeholder.getStakeholderMobileNo());
		toUpdate.setStakeholderEmail(stakeholder.getStakeholderEmail());

		return stakeholderRepository.save(toUpdate);
	}

}
