package com.axis.lms.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.axis.lms.model.Stakeholder;

@Repository
public interface StakeholderRepository extends CrudRepository <Stakeholder, String> {

	@Transactional
	@Query("select count(sh) from Stakeholder sh where sh.stakeholderId=:stakeholderId")
	long checkIfStakeholderAlreadyExists(@Param("stakeholderId") String stakeholderId);
	
	@Transactional
	@Modifying
	@Query("update Stakeholder sh set sh.stakeholderName=:stakeholderName, sh.stakeholderMobileNo=:stakeholderMobileNo, sh.stakeholderEmail=:stakeholderEmail where sh.stakeholderId=:stakeholderId")
	void updateStakeholder(@Param("stakeholderId") String stakeholderId, @Param("stakeholderName") String stakeholderName, @Param("stakeholderMobileNo") String stakeholderMobileNo, @Param("stakeholderEmail") String stakeholderEmail);

	
}
