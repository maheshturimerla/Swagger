package com.microservices.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, BigDecimal>{

	/** Fetching the employeess by anme **/
	Employee findByEmpName(String empName);
	
	/**Ignore Case **/
	Employee findByEmpNameIgnoreCase(String empName);//Single Property
	
	
	
}
