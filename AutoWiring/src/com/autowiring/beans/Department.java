package com.autowiring.beans;

public class Department {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}

	public Department() {
		super();
	}
	

}
