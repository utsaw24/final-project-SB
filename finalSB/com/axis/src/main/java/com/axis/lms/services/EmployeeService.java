package com.axis.lms.services;

import java.util.List;

import com.axis.lms.model.Employee;




public interface EmployeeService {
	 

     List<Employee> getAllemployees();
     Employee getEmployeeById(String empId);
     void addEmployee(Employee employee);
     void deleteEmployeeById(String empId);
   //  void  updateEmployeeById(Employee employee, String empId);
	
}
