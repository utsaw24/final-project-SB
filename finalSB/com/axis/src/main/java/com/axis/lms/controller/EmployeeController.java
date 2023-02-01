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

import com.axis.lms.model.Employee;
import com.axis.lms.services.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/view-employee/{empId}")
	public Employee getEmployeeById(@PathVariable String empId) {		
		return employeeService.getEmployeeById(empId);
	}
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllemployees();
	}
	@PostMapping("/add-employee")
	public  ResponseEntity<String> addEmployee (@RequestBody Employee employee) {
		 employeeService.addEmployee(employee);
		 return new ResponseEntity<>("Added....",HttpStatus.OK);
	} 
	@DeleteMapping("/delete-employee/{empId}")
	public void deleteEmployeeById(@PathVariable String empId) {
		employeeService.deleteEmployeeById(empId);
	}
	/*@PutMapping("/update-employee/{empId}")
	public Employee updateEmployee (@RequestBody Employee employee, @PathVariable String empId) {
		return employeeService.updateEmployeeById(employee, empId);
	}*/
}
