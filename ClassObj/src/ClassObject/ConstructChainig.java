/*package ClassObject;
/*
 * constructor chaining
 * A constructor is invoked from another consturctor
 * A class can have 
 
class Person{
	String name;
	String city;
	String country;
	//Default Constructor
	Person(){
		this("Delhi","India");
		this.name="Nani";
		//this.city="chennai";
		//this.country="India";
	}
	//Parameterized constructor with one paramenter
	Person(String name){
		
		this.name=name;
		
	}
	//parameterized construcotr with two parameters
	Person(String city,String country){
		this.city=city;
		this.country=country;
		
	}
	public void DisplayDetails() {
		System.out.println("Name:"+this.name);
		System.out.println("city:"+this.city);
		System.out.println("country:"+this.country);

	}
}

public class ConstructChainig {
	public static void main(String[] args) {
		Person p=new Person();
		p.DisplayDetails();
	}

}*/
