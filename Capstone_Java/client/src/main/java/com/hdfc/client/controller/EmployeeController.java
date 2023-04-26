package com.hdfc.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.client.dto.Employee;
import com.hdfc.client.service.IEmployeeService;
/**
 * 
 * @author Bharath Kumar
 *
 * @CreatedDate 22-Apr-2023
 */
@RestController
@RequestMapping("/client/employee")
public class EmployeeController {
	
	@Autowired
	IEmployeeService service;
	
	@GetMapping("/get/{employeeId}")
	public Employee getEmployee(@PathVariable long employeeId) {
		return service.getEmployee(employeeId);
	}
}
