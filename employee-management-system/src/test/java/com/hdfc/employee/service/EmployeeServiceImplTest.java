package com.hdfc.employee.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.employee.entity.Employee;
import com.hdfc.employee.exception.InvalidEmployeeIdException;

@SpringBootTest
class EmployeeServiceImplTest {
	
	@Autowired
	IEmployeeService employeeService;

	@Test
	void testGetEmployeeById() throws InvalidEmployeeIdException {
		Employee employee = employeeService.getEmployeeById(1);
		assertEquals("Bharath Kumar", employee.getEmployeeName());
	}

}