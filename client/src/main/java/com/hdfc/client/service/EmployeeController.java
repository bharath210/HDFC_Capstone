package com.hdfc.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.client.entiry.Employee;

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
