package com.hdfc.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hdfc.client.entiry.Employee;
@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	RestTemplate restTemplate;
	
	String baseUrl = "https://localhost:7500/api/employee/get/";
	
	public Employee getEmployee(long employeeId) {
		return restTemplate.getForObject(baseUrl + employeeId, Employee.class);
	}

}
