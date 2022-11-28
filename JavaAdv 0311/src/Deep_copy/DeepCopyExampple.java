package Deep_copy;
public class DeepCopyExampple {
	public static void main(String[] args) throws CloneNotSupportedException {
		Course course1=new Course("Java","python","Database");
		Student student1=new Student(1001,"jack",course1);
		Student student2=null;
		student2=(Student)student1.clone();
		System.out.println(student1);
		System.out.println(student2);
		
	//changing the student1 subjectone course name
		student1.course.SubjectOne="Core Java";
		System.out.println(student1.course.getSubjectOne());
		System.out.println(student2.course.getSubjectOne());
		//changing the student2 subjectone course name
		student2.course.SubjectTwo="Adv C++";
		System.out.println(student1.course.SubjectTwo);
		System.out.println(student2.course.SubjectTwo);
		//printing differently
		System.out.println(student1);
		System.out.println(student2);
	}

}
