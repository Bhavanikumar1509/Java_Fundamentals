package Misc;
class Student{
	private String name;
	private String course;
	private int age;
	private static String schoolName;
	static {
		Student.schoolName="ABC School";
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	public String getCourse() {
		return this.course;
	}
	public void setAge(int age) {
		if(age>=18) {
			this.age=age;
		}
		else {
			System.out.println("you are not allowed");
		}
		
	}
	public int getAge() {
		return this.age;
	}
	public String getSchoolName() {
		return schoolName;
		
	}
}

public class GetterSetterExam1 {
	public static void main(String[] args) {
		Student s=new Student();
		s.setname("nani");
		s.setCourse("cse");
		s.setAge(19);
		System.out.println("Name:"+s.getName());
		System.out.println("Course:"+s.getCourse());
		System.out.println("age:"+s.getAge());
		System.out.println("SchoolName:"+s.getSchoolName());
	}

}
