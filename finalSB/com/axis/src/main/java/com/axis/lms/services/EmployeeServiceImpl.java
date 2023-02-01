package com.axis.lms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.lms.exception.EmployeeAlreadyExistsException;
import com.axis.lms.exception.EmployeeNotFoundException;
import com.axis.lms.model.Employee;
import com.axis.lms.repository.EmployeeRepository;





@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	/*
	@Override
	public Employee getEmployeeById(String empId) {
		// TODO Auto-generated method stub
		Optional<Employee> employeeOpt = employeerepository.findById(empId);
		if(employeeOpt.isPresent())
			return employeeOpt.get();
	     }
			throw new EmployeeNotFoundException("Employee Not Found by Id "+empId);
}

	@Override
	public List<Employee> getAllemployees() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeerepository.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
   if(employeerepository.checkIfEmployeeAlreadyExists(employee.getEmpId()) != 0) {
			 throw new EmployeeAlreadyExistsException("employee with Id "+"" +employee.getEmpId()+" "+" already exists"); 
			 }// TODO Auto-generated method stub
		return employeerepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(String empId) {
		// TODO Auto-generated method stub
		employeerepository.deleteById(empId);
		
	}

	@Override
	public Employee updateEmployeeById(Employee employee, String empId) {
		// TODO Auto-generated method stub
		Employee toUpdate = employeerepository.findById(empId).get();
		toUpdate.setEmpName(employee.getEmpName());
		toUpdate.setEmpEmail(employee.getEmpEmail());
		toUpdate.setEmpDesignation(employee.getEmpDesignation());
		toUpdate.setEmpDepartment(employee.getEmpDepartment());
		toUpdate.setEmpProjectName(employee.getEmpProjectName());
		toUpdate.setSupervisorName(employee.getSupervisorName());
		toUpdate.setEmpAddress(employee.getEmpAddress());
		toUpdate.setEmpPassword(employee.getEmpPassword());
		toUpdate.setProjectId(employee.getProjectId());
		return employeerepository.save(toUpdate);
	}*/

	@Override
	public List<Employee> getAllemployees() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(String empId) {
		Optional<Employee> employeeOpt = employeeRepository.findById(empId);
		if(employeeOpt.isPresent()) {
			return employeeOpt.get();
	     }
			throw new EmployeeNotFoundException("Employee Not Found by Id "+empId);
}

	@Override
	public void addEmployee(Employee employee) {
		 if(employeeRepository.checkIfEmployeeAlreadyExists(employee.getEmpId()) != 0) {
			 throw new EmployeeAlreadyExistsException("employee with Id "+"" +employee.getEmpId()+" "+" already exists"); 
			 }// TODO Auto-generated method stub
		 employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(String empId) {
		// TODO Auto-generated method stub
          employeeRepository.deleteById(empId);
		
	}

		
	
/*
	@Override
	public void updateEmployeeById(Employee employee, String empId) {
		// TODO Auto-generated method stub
		
	}*/

	

}
