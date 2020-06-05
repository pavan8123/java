package com.pavan.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pavan.springboot.model.Department;
import com.pavan.springboot.model.Employee;
import com.pavan.springboot.repository.Respository;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	Respository respository;
 public List<Employee> getEmployees(){
	 return respository.getEmployees();
 }
public List<Department> getDepartments() {
	
	return respository.getDepartments();
}
}
