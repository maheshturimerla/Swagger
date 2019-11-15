package com.microservices.model;

import java.io.Serializable;
import javax.persistence.*;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;


/**
 * The persistent class for the EMPLOYEE database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
    
	@Id
	@Column(name="EMP_ID")
	@ApiModelProperty(value="EMP ID")
	private BigDecimal empId;

	@Column(name="EMP_NAME")
	@ApiModelProperty(value="EMP NAME")
	private String empName;

	@Column(name="EMP_SAL")
	private BigDecimal empSal;

	public Employee() {
	}

	public BigDecimal getEmpId() {
		return this.empId;
	}

	public void setEmpId(BigDecimal empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public BigDecimal getEmpSal() {
		return this.empSal;
	}

	public void setEmpSal(BigDecimal empSal) {
		this.empSal = empSal;
	}

}