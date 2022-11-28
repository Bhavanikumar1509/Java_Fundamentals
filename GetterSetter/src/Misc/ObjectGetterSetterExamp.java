package Misc;
import java.util.*;
class Person{
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
class Client{
	List<Person>pList=new ArrayList<Person>();

	public List<Person> getpList() {
		return pList;
	}

	public void setpList(List<Person> pList) {
		this.pList = pList;
	}
	
	
}

public class ObjectGetterSetterExamp {
	public static void main(String[] args) {
		//Person p1=new Person("Nani");
		//System.out.println(p1);
		List<Person>list=new ArrayList<Person>();
		list.add(new Person("nani"));
		list.add(new Person("lucky"));
		list.add(new Person("dhoni"));
		Client client=new Client();
		client.setpList(list);
		for(Person p:client.getpList()) {
			System.out.println(p);
		}
		
		
		
	}

}
