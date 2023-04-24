package com.hdfc.capstone.ems.vo;

import java.time.LocalDate;

import com.hdfc.capstone.ems.utils.EncryptionUtil;
/**
 * 
 * @author Bharath Kumar
 *
 * @CreatedDate 22-Apr-2023
 */
public class EmployeeVO {
	
	private long employeeId;
	private String employeeName;
	private String dateOfBirth;
	
	public EmployeeVO(long employeeId, String employeeName, LocalDate dateOfBirth) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = EncryptionUtil.encrypt(dateOfBirth.toString());
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = EncryptionUtil.encrypt(dateOfBirth.toString());
	}
	

}
