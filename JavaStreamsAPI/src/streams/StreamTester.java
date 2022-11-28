package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Person{
	private int id;
	private String Name;
	private int age;
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", Name=" + Name + ", age=" + age + "]";
	}
	
}

public class StreamTester {
	public static void main(String[] args) {
		List<Person>perosnList=new ArrayList<Person>();
		perosnList.add(new Person(101, "Nani", 12));
		perosnList.add(new Person(102, "Bindhe", 14));
		perosnList.add(new Person(103, "Mojesh", 15));
		perosnList.add(new Person(104, "Lucky", 13));
		Stream<Person>personStream=perosnList.stream();
		perosnList.forEach(ele->System.out.println(ele));
		//Filter base upon condition
		System.out.println("_________filetring_________");
		perosnList.stream().filter(person->(person.getName().equals("Nani"))).forEach(System.out::println);
		//Filter base upon Multiple condition
		System.out.println("_________multifiletring_________");
		perosnList.stream().filter(person->(person.getName().equals("Nani"))||person.getAge()>=14).forEach(System.out::println);
		
		//Map and Reduce
		
		Integer totalAge=perosnList.stream().map(Person::getAge).reduce((total, age)->(total+age)).get();
		System.out.println("Total Age:"+totalAge);
		
	}

}
