package com.microservices.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.model.Employee;
import com.microservices.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
    @Autowired
	public EmployeeRepository employeeRepository;
    

	public List<Employee> fetchEmployees(){
		return employeeRepository.findAll();
	}
 	
	public Employee fetchEmployees(String name){
		return employeeRepository.findByEmpName(name);
	}
	
	public void deleteEmployee(String id){
		 employeeRepository.delete(new BigDecimal(id));
	}
		
	public void saveEntity(Employee employee){
        employeeRepository.save(employee);
		
	}

}
