package Shallow_Copy;

public class CloneableExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		Course course1=new Course("Java","python","Database");
		Student student1=new Student(1001,"jack",course1);
		Student student2=null;
		student2=(Student)student1.clone();
		System.out.println(student1);
		System.out.println(student2);
		//changing the student1 subjectone course name
		student1.course.SubjectOne="Core Java";
		System.out.println(student1.course.SubjectOne);
		System.out.println(student2.course.SubjectOne);
		//changing the student2 subjectone course name
		student2.course.SubjectTwo="Adv C++";
		System.out.println(student1.course.SubjectTwo);
		System.out.println(student2.course.SubjectTwo);
		// it will print the values as same in studnet1 as student 2...just clone as it is
	}

}
