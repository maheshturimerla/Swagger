/**
 * 
 */
package com.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.model.Employee;
import com.microservices.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author Abhishek Muthyam
 *
 */
@RestController
@Api(tags="Employee",description="Employee")
public class EmployeeController {

	@Autowired
	public EmployeeService employeeService;

	@RequestMapping(value="/employees",method=RequestMethod.GET)
	@ApiOperation(value="GET ALL Employee", notes="GET ALL Employee",response=Employee.class)
	public List<Employee> fetchEmployees(){
		return employeeService.fetchEmployees();
	}
	
	@RequestMapping(value="/employees/{name}",method=RequestMethod.GET)
	@ApiOperation(value="GET Employee", notes="Get Employee")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="EMP Name",paramType="path")
	})
	public Employee fetchEmployess(@PathVariable(value="name") String name){
		return employeeService.fetchEmployees(name);

	}

	@RequestMapping(value="/employee",method=RequestMethod.POST)
	@ApiOperation(value="Add Employee", notes="Add Employee")
	public String saveEntity(@RequestBody Employee employee){
		employeeService.saveEntity(employee);
		return "Data Saved Successfully";
	}

	@RequestMapping(value="/employee/{id}",method=RequestMethod.DELETE)
	@ApiOperation(value="Delete Employee", notes="Delete Employee")
	public String deleteEntity(@PathVariable(value="id") String id){
		employeeService.deleteEmployee(id);
		return "Data deleted Successfully";
	}

}
