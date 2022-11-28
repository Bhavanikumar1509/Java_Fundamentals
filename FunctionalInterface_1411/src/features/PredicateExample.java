//package features;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//
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
//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//}
//
//class EmployeePredicates {
//	public static Predicate<Employee> isAdultFemale(){
//		return e -> e.getAge()>18 && e.getGender().equalsIgnoreCase("female");
//	}
//	public static Predicate<Employee> isAdultMale(){
//		return e -> e.getAge()>18 && e.getGender().equalsIgnoreCase("male");
//	}
//	public static Predicate<Employee> isAgeMoreThan(Integer age) {
//		return e -> e.getAge() > age;
//	}
//	public static List<Employee> filterEmps(List<Employee> employees, Predicate<Employee> predicate) {
//		return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
//	}
//}
//public class PredicateExample {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList<Employee> aList = new ArrayList<Employee>();
//		aList.add(new Employee(1,"nani","reddy","male",23));
//		aList.add(new Employee(2,"lucky","reddy","male",22));
//		
//}
//}