package com.hdfc.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hdfc.client.dto.Employee;
/**
 * 
 * @author Bharath Kumar
 *
 * @CreatedDate 22-Apr-2023
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${service.host}")
	String host;
	
	public Employee getEmployee(long employeeId) {
		return restTemplate.getForObject(host + "/api/employee/get/" + employeeId, Employee.class);
	}

}
