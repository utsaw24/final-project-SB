package com.axis.lms.repository;




import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.axis.lms.model.SupportTeam;


@Repository
public interface SupportTeamRepository  extends  CrudRepository<SupportTeam, String>{


	@Transactional
	@Query("select count(st) from SupportTeam st where st.supportTeamId=:supportTeamId")
	long checkIfSupportTeamAlreadyExists(@Param("supportTeamId") String supportTeamId);
	

	@Transactional
	@Modifying
	@Query("update SupportTeam st set st.supportTeamName=:supportTeamName, st.supportTeamEmail=:supportTeamEmail, st.supportTeamMobileNo=:supportTeamMobileNo, st.supportTeamDesignation=:supportTeamDesignation where st.supportTeamId=:supportTeamId")
	void updateSupportTeam(@Param("supportTeamId") String supportTeamId, @Param("supportTeamName") String supportTeamName, @Param("supportTeamEmail") String supportTeamEmail, @Param("supportTeamMobileNo") long supportTeamMobileNo, @Param("supportTeamDesignation") String supportTeamDesignation);

		
		
		
	
}
