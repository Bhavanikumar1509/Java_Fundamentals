package ClassObject;
import java.util.*;
class Student{
	int admno;
	String sname;
	private static String courseName,collegeName;
	float eng,math,science,total;
	static {
		courseName="PCM";
		collegeName="ABC COllege";
		
		
	}
public void Takedata() {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the admission number:");
	this.admno=sc.nextInt();
	sc.nextLine();
	System.out.print("enter student name:");
	this.sname=sc.nextLine();
	System.out.print("enter the eng marks");
	this.eng=sc.nextFloat();
	System.out.print("enter the Math marks");
	this.math=sc.nextFloat();
	System.out.print("enter the science marks");
	this.science=sc.nextFloat();
}
private float ctotal() {
	this.total=this.eng+this.math+this.science;
	return total;
	
}
public void Showdata() {
	System.out.println("\tadmno:"+this.admno);
	System.out.println("\tname:"+this.sname);
	System.out.println("\teng marks:"+this.eng);
	System.out.println("\tmath marks:"+this.math);
	System.out.println("\tscience marks:"+this.science);
	System.out.println("\tTotal Marks:"+this.ctotal());
	System.out.println("\tcourse:"+Student.courseName);
	System.out.println("\tcollege:"+Student.collegeName);
}
}
public class ASS01 {
	public static void main(String[] args) {
		
		Student[] stud=new Student[5];
		for (int i=1;i<=5;i++) {
			System.out.println("___details of Student"+i+"___");
			stud[i]=new Student();
			stud[i].Takedata();
			stud[i].Showdata();
		}
		
	}

}
