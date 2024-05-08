package com.avinashit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.avinashit.entity.Employee;
import com.avinashit.service.IEmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private IEmployeeService employeeService;

	@PostMapping("/save")
	public ResponseEntity<Employee> createEmp(@RequestBody Employee employee) {
		return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.OK);
	}

	@GetMapping("/getEmp")
	public ResponseEntity<Optional<Employee>> getEmployee(@RequestParam Integer id) {
		return new ResponseEntity<>(employeeService.getEmpById(id), HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>>getAllEmp(){
		return new ResponseEntity<>(employeeService.getAllEmployees(),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee>updateEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updateEmp(employee),HttpStatus.OK);
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<List<Employee>>findByName(@PathVariable("name" )String name){
		return new ResponseEntity<List<Employee>>(employeeService.findByName(name), HttpStatus.OK);
	}

}
