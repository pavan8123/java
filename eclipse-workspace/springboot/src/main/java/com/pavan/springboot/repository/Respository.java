package com.pavan.springboot.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pavan.springboot.model.Department;
import com.pavan.springboot.model.Employee;
@Repository
public class Respository {

	public List<Employee> getEmployees() {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1,"pavan","virtusa"));
		list.add(new Employee(2,"swetha","sjs"));
		list.add(new Employee(1,"archana","cgi"));
		return list;
	}

	public List<Department> getDepartments() {
		List<Department>list=new ArrayList<Department>();
		list.add(new Department(1, "mechancal"));
		list.add(new Department(2, "Computer Seience"));
		list.add(new Department(1, "Informational Sceince"));
		return list;
	}
}
