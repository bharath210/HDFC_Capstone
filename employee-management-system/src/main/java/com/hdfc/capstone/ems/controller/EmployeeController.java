package com.hdfc.capstone.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.capstone.ems.exception.InvalidEmployeeIdException;
import com.hdfc.capstone.ems.service.IEmployeeService;
import com.hdfc.capstone.ems.vo.EmployeeVO;

import lombok.extern.slf4j.Slf4j;
/**
 * 
 * @author Bharath Kumar
 *
 * @CreatedDate 22-Apr-2023
 */
@Slf4j
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
		
	@Autowired
	IEmployeeService employeeService;
	
	@GetMapping("/get/{employeeId}")
	public EmployeeVO getEmployeeById(@PathVariable long employeeId) throws InvalidEmployeeIdException {
		log.info("getByEmployeeId : {} called", employeeId);
		return employeeService.getEmployeeById(employeeId);
	}

}
