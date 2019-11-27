package com.example.polls.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.polls.model.Employee;
import com.example.polls.payload.ApiResponse;
import com.example.polls.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/auth")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;

	
	@PostMapping("/addEmployee")
	public ResponseEntity<?> saveEmployeeDetails(@Valid @RequestBody Employee employee) {
		
		employeeRepository.save(employee);
		
		return ResponseEntity.ok(new ApiResponse(true, "Employee created Successfully"));
	}
}
