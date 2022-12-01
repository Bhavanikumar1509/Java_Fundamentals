package com.autowiring.beans;

public class EmployeeBean {
	private String fullName;
	private Department departmentbean;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Department getDepartmentbean() {
		return departmentbean;
	}
	public void setDepartmentbean(Department departmentbean) {
		this.departmentbean = departmentbean;
	}
	@Override
	public String toString() {
		return "EmployeeBean [fullName=" + fullName + ", departmentbean=" + departmentbean + "]";
	}
	
	

}