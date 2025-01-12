package com.avinashit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avinashit.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	
	public List<Employee>findByName(String name);

}
