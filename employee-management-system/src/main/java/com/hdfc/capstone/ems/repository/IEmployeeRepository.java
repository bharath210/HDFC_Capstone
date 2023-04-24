package com.hdfc.capstone.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.capstone.ems.entity.Employee;
/**
 * 
 * @author Bharath Kumar
 *
 * @CreatedDate 21-Apr-2023
 */
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long>{

}
