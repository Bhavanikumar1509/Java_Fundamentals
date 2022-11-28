//package features;
//import java.util.*;
//import java.util.function.Supplier;
//class Employee {
//	private Integer id;
//	private String firstName;
//	private String lastName;
//	private String gender;
//	private Integer age;
//	
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public Integer getAge() {
//		return age;
//	}
//	public void setAge(Integer age) {
//		this.age = age;
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
//				+ ", age=" + age + "]";
//	}
//	public Employee(Integer id, String firstName, String lastName, String gender, Integer age) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.gender = gender;
//		this.age = age;
//	}
//	
//}
//public class FunctionalInterfaceEx_3 {
//	public static Supplier<List<Employee>>populateEmployee{
//		Supplier<List<Employee>>employeeList=()->{
//			ArrayList<Employee> employees = new ArrayList<Employee>();
//			employees.add(new Employee(1,"nani","reddy","male",23));
//			employees.add(new Employee(2,"lucky","reddy","male",22));
//			return employees;
//		};
//		return employeeList;
//	}
//	public static void main(String[] args) {
//		System.out.println(populateEmployee().get());
//	}
//		
//		
//	}
//
//}
