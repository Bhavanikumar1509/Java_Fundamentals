package collections;
import java.util.*;
class Employee implements Comparable<Employee>{
	private int EmpId;
	private String EmpName;
	public Employee(int empId, String empName) {
		super();
		EmpId = empId;
		EmpName = empName;
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
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + "]";
	}
	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		return this.EmpName.compareTo(e1.EmpName);
	}
}
public class Assignment {
	public static void main(String[] args) {
		TreeSet<Employee>emp=new TreeSet<Employee>();
		Employee emp1=new Employee(100, "abc");
		Employee emp2=new Employee(101, "def");
		Employee emp3=new Employee(102, "ghi");
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		System.out.println(emp);
	}

}
