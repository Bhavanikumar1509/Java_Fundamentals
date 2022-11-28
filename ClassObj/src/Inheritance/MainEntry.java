/*package Inheritance;
import java.util.*;

class Student{
	private int id;
	private String name,course;
	private static String schoolName;
	static {
		Student.schoolName="Shri Ram Global";
		}
	

Scanner sc=new Scanner(System.in);
public void acceptDetails() {
	System.out.print("enter studet Id:");
	this.id=sc.nextInt();
	sc.nextLine();
	System.out.print("enter stude  name:");
	this.name=sc.nextLine();
	System.out.print("enter stude Course:");
	this.course=sc.nextLine();
}
public void displayDetails() {
	System.out.println("student basic information");
	System.out.println("Id:"+this.id);
	System.out.println("name:"+this.name);
	System.out.println("course:"+this.course);
	System.out.println("school:"+Student.schoolName);
	
}
}
class Marks extends Student{
	float objectiveMaths;
	float subjectiveMaths;

public void acceptDetails(){
	super.acceptDetails();
	System.out.print("enter objective maths:");
	this.objectiveMaths=sc.nextFloat();
	System.out.print("enter subjective maths:");
	this.subjectiveMaths=sc.nextFloat();
}
public void displayDetails(){
	
	super.displayDetails();
	System.out.println("marks scored");
	System.out.print("Objective marks:"+this.objectiveMaths);
	System.out.print("subjective marks:"+this.subjectiveMaths);
	
	
}
}
class Sports extends Marks{
	protected float score;
	public void acceptDetails() {
		super.acceptDetails();
		System.out.print("ENter Sports Marks:");
		this.score=sc.nextFloat();
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("sports score:"+this.score);
	}
}
class Results extends Sports{
	float totalMarks,averageMarks;
	public void calculateResult() {
		this.totalMarks=this.objectiveMaths+this.subjectiveMaths+this.score;
		this.averageMarks=this.totalMarks/3;
		System.out.println("Total marks:"+this.totalMarks);
		System.out.println("Average Marks:"+this.averageMarks);
		if(this.averageMarks>=75 && this.objectiveMaths>70 && this.subjectiveMaths>70) {
			System.out.println("Congratulations!! got shortlisted");
		}
		else {
			System.out.println("OOPS!! Better luck next time");
		}
	}
}
public class MainEntry {
	public static void main(String[] args) {
		Results rs=new Results();
		rs.acceptDetails();
		rs.displayDetails();
		rs.calculateResult();
		
	}

}*/
