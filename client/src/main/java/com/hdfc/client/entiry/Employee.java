package com.hdfc.client.entiry;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.LocalDate;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Employee {
	
	private long employeeId;
	private String employeeName;
	private LocalDate dateOfBirth;
	
	public Employee() {
		super();
	}
    private static final String ALGORITHM = "AES";
    private static final String KEY = "mysecretkey12345";
	public Employee(long employeeId, String employeeName, String dateOfBirth) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = LocalDate.parse(decrypt(dateOfBirth, KEY));
	}
	

	
	 private static String decrypt(String encryptedText, String key) {
	        try {
	            Key aesKey = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), ALGORITHM);
	            Cipher cipher = Cipher.getInstance(ALGORITHM);
	            cipher.init(Cipher.DECRYPT_MODE, aesKey);
	            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
	            return new String(decrypted, StandardCharsets.UTF_8);
	        } catch (Exception e) {
	            throw new RuntimeException("Error decrypting text", e);
	        }
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
		this.dateOfBirth = LocalDate.parse(decrypt(dateOfBirth, KEY));
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
	

}
