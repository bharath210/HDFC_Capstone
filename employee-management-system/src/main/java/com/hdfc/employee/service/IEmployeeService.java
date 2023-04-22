package com.hdfc.employee.service;

import com.hdfc.employee.entity.Employee;
import com.hdfc.employee.exception.InvalidEmployeeIdException;
import com.hdfc.employee.vo.EmployeeVO;

/**
 * 
 * @author Bharath Kumar
 *
 * @CreatedDate 21-Apr-2023
 */
public interface IEmployeeService {
	
	public EmployeeVO getEmployeeById(long employeeId) throws InvalidEmployeeIdException;
}
