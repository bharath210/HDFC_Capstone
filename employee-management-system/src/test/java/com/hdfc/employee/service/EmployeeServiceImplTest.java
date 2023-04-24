package com.hdfc.employee.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.capstone.ems.exception.InvalidEmployeeIdException;
import com.hdfc.capstone.ems.service.IEmployeeService;
import com.hdfc.capstone.ems.vo.EmployeeVO;

@SpringBootTest
class EmployeeServiceImplTest {
	
	@Autowired
	IEmployeeService employeeService;

	@Test
	void testGetEmployeeById() throws InvalidEmployeeIdException {
		EmployeeVO employee = employeeService.getEmployeeById(1);
		assertEquals("Bharath Kumar", employee.getEmployeeName());
	}

}
