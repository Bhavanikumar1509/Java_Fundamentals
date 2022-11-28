package EmloyeeManagement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements Serializable {
	static List<Employee> EmpList = new ArrayList<Employee>();

	public static List<Employee> getEmpList() {
		return EmpList;
	}

	public static void setEmpList(List<Employee> empList) {
		EmpList = empList;
	}
	 static void AddNewEmployee(Employee employee ) {
		Scanner sc=new Scanner(System.in);
		int id,Salary;
		String name,Designation;
		employee.setEmpId(id=sc.nextInt());
		employee.setEmpName(name=sc.nextLine());
		employee.setEmpSalary(Salary=sc.nextInt());
		employee.setEmpDesignation(Designation=sc.nextLine());
		EmpList.add(employee);
		
	}
	 void getEmployeeById(int id) {
		Iterator<Employee> itr = EmpList.iterator();
		boolean idFound = false;
		while (itr.hasNext()) {
			idFound = true;
			Employee emp = itr.next();
			if (emp.getEmpId() == id) {
				emp.displayObjects();
			}
		}
	}
	void updateEmployee(int id, Employee employee) {
		Iterator<Employee> itr = EmpList.iterator();
		boolean idFound = false;
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp.getEmpId() == id) {
				idFound = true;
				emp.setEmpId(employee.getEmpId());
				emp.setEmpName(employee.getEmpName());
				emp.setEmpDesignation(employee.getEmpDesignation());
				emp.setEmpSalary(employee.getEmpSalary());

			}
		}
		if (idFound == false)
			System.out.println("Employee id not found !!!");
	}
	
	void deleteEmployee(int id) {
		Iterator<Employee> itr = EmpList.iterator();
		boolean idFound = false;
		while (itr.hasNext()) {
			idFound = true;
			Employee emp = itr.next();
			if (emp.getEmpId() == id) {
				EmpList.remove(emp);
			}
		}
		if (idFound == false)
			System.out.println("Employee id not found !!!");
	}
	
}
