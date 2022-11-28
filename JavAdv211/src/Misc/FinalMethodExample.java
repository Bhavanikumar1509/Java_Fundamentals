package Misc;


 final class Person{
	public  void displayDetails() {
		System.out.println("Displaying person details");
	}
}
 //The type Student cannot subclass the final class Person
/*class Student extends Person{
	
	public void displayDetails() {
		System.out.println("Displaying student detils");
	}
}*/
public class FinalMethodExample {
	public static void main(String[] args) {
		Person pe=new Person();
		pe.displayDetails();
	}

}
