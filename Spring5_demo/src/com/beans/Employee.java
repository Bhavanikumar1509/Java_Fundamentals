package com.beans;

public class Employee {
	int empId;
	String empname;
	public Employee(int empId, String empname) {
		super();
		this.empId = empId;
		this.empname = empname;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + "]";
	}
	
	

}
