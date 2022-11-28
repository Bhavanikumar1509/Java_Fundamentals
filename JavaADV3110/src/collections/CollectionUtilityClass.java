package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Person{
	private int personId;
	private String personName;
	private int peronAge;
	
	

	public Person(int personId, String personName, int peronAge) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.peronAge = peronAge;
	}

	public int getPersonId() {
		return personId;
	}
	
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", peronAge=" + peronAge + "]";
	}
	public int getPeronAge() {
		return peronAge;
	}

	public void setPeronAge(int peronAge) {
		this.peronAge = peronAge;
	}
	public static Comparator<Person>idComparator=new Comparator<Person>() {

		@Override
		public int compare(Person p1,Person p2) {
			// TODO Auto-generated method stub
			return p1.personId-p2.personId;
		}
		
	};
	public static Comparator<Person>nameAgeComparator=new Comparator<Person>() {

		@Override
		public int compare(Person p1,Person p2) {
			// TODO Auto-generated method stub
			int compare=p1.peronAge-p2.peronAge;
			if(compare==0)
				return p1.personName.compareTo(p2.personName);
			else
				return compare;
		}
		
	};

	public static Comparator<Person>nameComparator=new Comparator<Person>() {

		@Override
		public int compare(Person p1, Person p2) {
			// TODO Auto-generated method stub
			return p1.personName.compareTo(p2.personName);
		}
		
	};

}

public class CollectionUtilityClass {

	public static void main(String[] args) {
		List<Person> persons= new ArrayList<Person>();
		Person person1=new Person(100, "Ishika",12);
		Person person2=new Person(110, "Rishika",13);
		Person person3=new Person(120, "Abhiksha",12);
		Person person4=new Person(100, "Rushika",14);
		Person person5=new Person(5, "babu",16);
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		
		
		System.out.println("____COmparing BY iD__");
		Collections.sort(persons,Person.idComparator);
		System.out.println(persons);
		System.out.println("____COmparing BY Name__");
		Collections.sort(persons,Person.nameComparator);
		System.out.println(persons);
		System.out.println("____COmparing BY Age and Name__");
		Collections.sort(persons,Person.nameAgeComparator);
		System.out.println(persons);
		
		
		
		
		
		
	
		
		
	}
}
