package com.hdfc.capstone.ems.service;

import com.hdfc.capstone.ems.exception.InvalidEmployeeIdException;
import com.hdfc.capstone.ems.vo.EmployeeVO;

/**
 * 
 * @author Bharath Kumar
 *
 * @CreatedDate 21-Apr-2023
 */
public interface IEmployeeService {
	
	public EmployeeVO getEmployeeById(long employeeId) throws InvalidEmployeeIdException;
}
