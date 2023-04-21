package com.hdfc.employee.service;

import com.hdfc.employee.entity.Employee;
import com.hdfc.employee.exception.InvalidEmployeeIdException;

/**
 * 
 * @author Bharath Kumar
 *
 * @CreatedDate 21-Apr-2023
 */
public interface IEmployeeService {
	
	public Employee getEmployeeById(long employeeId) throws InvalidEmployeeIdException;
}
