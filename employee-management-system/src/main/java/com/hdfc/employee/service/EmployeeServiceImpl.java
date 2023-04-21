package com.hdfc.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.employee.entity.Employee;
import com.hdfc.employee.exception.InvalidEmployeeIdException;
import com.hdfc.employee.repository.IEmployeeRepository;

/**
 * 
 * @author Bharath Kumar
 *
 * @CreatedDate 21-Apr-2023
 */

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	IEmployeeRepository employeeRepo;

	@Override
	public Employee getEmployeeById(long employeeId) throws InvalidEmployeeIdException  {

		return employeeRepo.findById(employeeId).orElseThrow(
				() -> new InvalidEmployeeIdException("Invalid EmployeeId : " + employeeId));
	}
	
}
