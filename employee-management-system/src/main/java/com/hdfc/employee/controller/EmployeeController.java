package com.hdfc.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.employee.exception.InvalidEmployeeIdException;
import com.hdfc.employee.service.IEmployeeService;
import com.hdfc.employee.vo.EmployeeVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
		
	@Autowired
	IEmployeeService employeeService;
	
	@GetMapping("/get/{employeeId}")
	public EmployeeVO getEmployeeById(@PathVariable long employeeId) throws InvalidEmployeeIdException {
		log.info("Web service called");
		return employeeService.getEmployeeById(employeeId);
	}

}
