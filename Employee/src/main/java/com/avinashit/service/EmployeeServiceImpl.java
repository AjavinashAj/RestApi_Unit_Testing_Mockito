package com.avinashit.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avinashit.entity.Employee;
import com.avinashit.repository.EmployeeRepo;
@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepo repo;

	@Override
	public Employee createEmployee(Employee employee) {

		return repo.save(employee);
	}

	@Override
	public Optional<Employee> getEmpById(Integer id) {
		Optional<Employee> findById = repo.findById(id);
		return findById;
	}

	@Override
	public List<Employee> getAllEmployees() {

		return repo.findAll();
	}

	@Override
	public Employee updateEmp(Employee employee) {
		Optional<Employee> findById = repo.findById(employee.getId());
		if (findById != null) {
			return repo.save(employee);
		}

		return null;
	}

	@Override
	public List<Employee> findByName(String name) {
		List<Employee> findByName = repo.findByName(name);
		if(findByName!=null) {
			return findByName;
		}
		else {
			return Collections.EMPTY_LIST;
		}
				
				
				
	}

}
