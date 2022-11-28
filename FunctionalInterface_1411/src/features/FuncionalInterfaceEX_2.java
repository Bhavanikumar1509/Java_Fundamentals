//package features;
//
//import java.util.HashMap;
//import java.util.function.Function;
//
//class Student{
//	static HashMap<Integer,String>students=new HashMap<Integer,String >();
//	public static void addStudents(String studentName,int studentId) {
//		if(!students.containsKey(studentId))
//			students.put(studentId, studentName);
//		else
//			System.out.println("Student already registered");
//	}
//}
//
//public class FuncionalInterfaceEX_2 {
//	public static void main(String[] args) {
//		Function<Integer,String>getDetails=(Integer id)->{
//			if(Student.students.containsKey(id))
//				return Student.students.get(id);
//			else
//				return "student does'nt exist with this id";
//		};
//		
//		}
//	}
//
