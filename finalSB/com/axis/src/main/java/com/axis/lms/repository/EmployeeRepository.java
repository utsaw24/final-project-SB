package com.axis.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.axis.lms.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{
	

	@Transactional
	@Query("select count(e) from Employee e where e.empId=:empId")
	long checkIfEmployeeAlreadyExists(@Param("empId") String empId);
	
}
