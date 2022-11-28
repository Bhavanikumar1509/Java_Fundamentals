package Overriding;
import java.util.*;
class Person{
	String name;
	String city;
	public Person(String name,String city) {
		this.name=name;
		this.city=city;
		
	}
	public void showData() {
		System.out.println("Name:"+name);
		System.out.println("City:"+city);
	}
}

class Employee extends Person{
	String designation;
	float salary;
	public Employee(String designation,float salary,String name,String city) {
		super(name,city);
		this.designation=designation;
		this.salary=salary;
		
	}
	@Override
	public void showData() {
		super.showData();
		System.out.println("designantion:"+this.designation);
		System.out.println("Salary:"+this.salary);
	}
}
class Student extends Person{
	String course;
	int fee;
	public Student(String name,String city,String course,int fee){
		super(name,city);
		this.course=course;
		this.fee=fee;
		
	}
	@Override
	public void showData() {
		super.showData();
		System.out.println("Course:"+course);
		System.out.println("Fee Structure:"+fee);
	}
	
}

public class Example1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice:");
		System.out.println("1-student \t 2- Employee");
		System.out.print("choice:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Employee emp=new Employee("software",15000,"nani","tip");
			emp.showData();
		
		case 2:
			Student st=new Student("lucky","mad","cse",120000);
			st.showData();
		}
			
		
	}

}
