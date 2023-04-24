package com.hdfc.capstone.ems.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.capstone.ems.exception.InvalidEmployeeIdException;
import com.hdfc.capstone.ems.vo.EmployeeVO;

@SpringBootTest
class EmployeeServiceImplTest {
	
	@Autowired
	IEmployeeService service;

	@Test
	void testGetEmployeeById() throws InvalidEmployeeIdException {
		EmployeeVO employee = service.getEmployeeById(1);
		assertEquals("Bharath Kumar", employee.getEmployeeName());
	}

}
