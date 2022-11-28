package Shallow_Copy;

class Course {
	String SubjectOne;
	String SubjectTwo;
	String SubjectThree;
	
	public Course(String subjectOne, String subjectTwo, String subjectThree) {
		super();
		SubjectOne = subjectOne;
		SubjectTwo = subjectTwo;
		SubjectThree = subjectThree;
	}
	public String getSubjectOne() {
		return SubjectOne;
	}
	public void setSubjectOne(String subjectOne) {
		SubjectOne = subjectOne;
	}
	public String getSubjectTwo() {
		return SubjectTwo;
	}
	public void setSubjectTwo(String subjectTwo) {
		SubjectTwo = subjectTwo;
	}
	public String getSubjectThree() {
		return SubjectThree;
	}
	public void setSubjectThree(String subjectThree) {
		SubjectThree = subjectThree;
	}
	@Override
	public String toString() {
		return "Course [SubjectOne=" + SubjectOne + ", SubjectTwo=" + SubjectTwo + ", SubjectThree=" + SubjectThree
				+ "]";
	}
	
}
