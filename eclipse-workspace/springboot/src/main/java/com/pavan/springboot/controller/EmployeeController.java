package com.pavan.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.springboot.model.Department;
import com.pavan.springboot.model.Employee;
import com.pavan.springboot.service.Service;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	Service service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/employee")
	public List<Employee> getEmployee(){
		 return service.getEmployees();
	 }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/departments")
	public List<Department> getDepartments(){
		 return service.getDepartments();
	 }
}
