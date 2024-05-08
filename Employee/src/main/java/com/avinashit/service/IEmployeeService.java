package com.avinashit.service;

import java.util.List;
import java.util.Optional;

import com.avinashit.entity.Employee;

public interface IEmployeeService {

	Employee createEmployee(Employee employee);

	Optional<Employee> getEmpById(Integer id);

	List<Employee> getAllEmployees();

	Employee updateEmp(Employee employee);

	List<Employee> findByName(String name);

}
