package EmloyeeManagement;
/*
 * Employee Managment System:
Use File Handling Approach to store employee data.Add
An employee can have, Id, Name, Salary and designation.

	In Main Menu, Create a menu driven System:
	1 - Get All Employees
	2 - Get Employee By Id
	3 - Add New Employee
	4 - Update Existing Employee
	5 - Delete Existing Employee
	
(Repeat this above menu, untill user wants to continue) - Hint: Use do..while loop

------------------------------------------------------------------------------

Part 2:

Employee is an individual entity, so create employee repository class to implement all the crud operations of it. All file handling operations will go in this repository class by using member functions.

Part 3:

Employee Repository class will implement IOperation interface for all the crud operations.

Part 4:

InvalidEmployeeException


-----------------------------------------------------------------------------
 * 
 * 
 * */


import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;
class Employee implements Comparable<Employee>,Serializable{
	 private static final long serialVersionUID = 1L;
	private int EmpId;
	private String EmpName;
	private double EmpSalary;
	private String EmpDesignation;
	
	
	public Employee() {
		super();
		
	}
	public Employee(int empId, String empName, double empSalary, String empDesignation) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpSalary = empSalary;
		EmpDesignation = empDesignation;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}
	public String getEmpDesignation() {
		return EmpDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		EmpDesignation = empDesignation;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + ", EmpDesignation="
				+ EmpDesignation + "]";
	}
	
		
	public void storeObject(Employee emp){        
       OutputStream ops = null;
       ObjectOutputStream objOps = null;
       try {
           ops = new FileOutputStream("C:\\Users\\kbhav\\Desktop\\tmp\\EmpFile.txt");
           objOps = new ObjectOutputStream(ops);
           objOps.writeObject(emp);
           objOps.flush();
       } catch (Exception e) {
           e.printStackTrace();
       }         
	}
	public void displayObjects(){         
       InputStream fileIs = null;
       ObjectInputStream objIs = null;
       try {
           fileIs = new FileInputStream("C:\\Users\\kbhav\\Desktop\\tmp\\EmpFile.txt");
           objIs = new ObjectInputStream(fileIs);
          Employee emp = (Employee) objIs.readObject();
           System.out.println(emp);
       } catch (Exception e) {
          e.printStackTrace();
      } 
   }
	@Override
	public int compareTo(Employee employee) {
		return this.getEmpId()-employee.getEmpId();
	} 
	void displayDetails() {
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Given below are the details of Employee with ID = " + this.getEmpId());
		System.out.println("ID : " + this.getEmpId());
		System.out.println("Name : " + this.getEmpName());
		System.out.println("Designation : " + this.getEmpDesignation());
		System.out.println("Salary : " + this.getEmpSalary());
		System.out.println("---------------------------------------------------------------------------");

	}
}
