package com.employee.model;

import javax.validation.constraints.Min;

import javax.validation.constraints.Size;

public class Employee {
	
	private int empId;
	
	
	@Size(min=4,message="Enter Name with min 4 character ")
	
	private String empName;
	
	
	@Min(value=4,message="Enter Salary with min 4 digit")
	private float sal;
	
	@Size(min=4,message="Enter Date of Birth")
	private String dob;
	
	@Size(min=4,message="Enter Designation with min 4 character ")
	
	private String designation;
	
	
	@Size(min=2,message="Enter CompanyName with min 4 character")
	private String companyName;
	
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	public Employee(int empId, String empName, float sal, String dob, String designation, String companyName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.dob = dob;
		this.designation = designation;
		this.companyName = companyName;
	}
	public Employee() {
		super();
	}
	

}
