package Misc;

import java.util.HashSet;
import java.util.Set;

/*
 * equals() and hashcode() methods.
 * -->As we know,Object class is the parent class for all the java class
 * -->these methods have been defined in object class.
 * 
 * equals() Method
 * verifies the equality of two objects
 * this method checks whether two object reference of same class are equal or not
 * Tip: Be default two objects are equal if they refer to the same memory location
 * 
 * hashcode() Method.
 * -->If we override equals() then we must override hashCode()
 * -->
 * 
 * 
 * */
class Employee{
	private Integer id;
	private String firstName;
	private String lastName;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj==this)
			return true;
		if(getClass()!=obj.getClass())
			return false;
		Employee emp=(Employee)obj;
		return(this.getId()==emp.getId());
	}
	
	@Override
	public int hashCode() {
		final int PRIME=31;
		int result=1;
		result=PRIME*result+getId();
		return result;
	}
	/**
	 * Conclusions:
	 * e1.equals(e2) then,e1.hashcode()==e2.hashcode() should always true
	 * But,
	 * if e1.hashcode() ==e2.hashcode is true,it doesn't mean that e1.equals(e2) will be true
	 * 
	 * 
	 * */
		
}
public class Example {
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setId(100);
		e2.setId(100);
		System.out.println(e1.getId()==e2.getId());
		System.out.println(e1.hashCode()==e2.hashCode());
		System.out.println(e1.equals(e2));
		/**
		 * If both employees are equal,
		 * In a set Collection that store unique object
		 * there must be one object inside HashSet gets createsd
		 * beacuse both objects refers to the same employee
		 * **/
		Set<Employee>employees=new HashSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		System.out.println(employees);
		
	}

}
