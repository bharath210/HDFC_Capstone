package com.hdfc.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.employee.entity.Employee;
import com.hdfc.employee.exception.InvalidEmployeeIdException;
import com.hdfc.employee.repository.IEmployeeRepository;
import com.hdfc.employee.vo.EmployeeVO;

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
