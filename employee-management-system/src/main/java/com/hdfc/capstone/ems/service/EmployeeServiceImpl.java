package com.hdfc.capstone.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.capstone.ems.entity.Employee;
import com.hdfc.capstone.ems.exception.InvalidEmployeeIdException;
import com.hdfc.capstone.ems.repository.IEmployeeRepository;
import com.hdfc.capstone.ems.vo.EmployeeVO;

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
	public EmployeeVO getEmployeeById(long employeeId) throws InvalidEmployeeIdException  {

		Employee employee = employeeRepo.findById(employeeId).orElseThrow(
				() -> new InvalidEmployeeIdException("Invalid EmployeeId : " + employeeId));
		EmployeeVO employeeVO = new EmployeeVO(employee.getEmployeeId(), employee.getEmployeeName(), employee.getDateOfBirth());
		return employeeVO;
	}
	
}
