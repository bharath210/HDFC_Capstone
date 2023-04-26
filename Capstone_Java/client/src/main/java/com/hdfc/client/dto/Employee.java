package com.hdfc.client.dto;

import java.time.LocalDate;

import com.hdfc.client.utils.DecryptionUtil;
/**
 * 
 * 
 * 
 * @author Bharath Kumar
 *
 * @CreatedDate 22-Apr-2023
 */
public class Employee {
	
	private long employeeId;
	private String employeeName;
	private LocalDate dateOfBirth;
	
	public Employee() {
		super();
	}
	public Employee(long employeeId, String employeeName, String dateOfBirth) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = LocalDate.parse(DecryptionUtil.decrypt(dateOfBirth));
	}


	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = LocalDate.parse(DecryptionUtil.decrypt(dateOfBirth));
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
	

}
