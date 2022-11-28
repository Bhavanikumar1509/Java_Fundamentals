package Serializible;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;

public class SerializabilityExampl1 {
	public static void main(String[] args) {
		/*
		 * 
		 * /Student student=new Student();
		 
		student.setStudentId(101);
		student.setStudentName("nani");*/
		Student student=new Student(101,"nani","software",100.00);
		String name="name";
		FileOutputStream outStream=new FileOutputStream(name "C:\\Users\\kbhav\\Desktop\\pend\\1.txt");
		ObjectOutputStream out=new ObjectOutputStream(outStream);
		out.writeObject(student);
		out.flush();
		out.close();
		outStream.close();
		System.out.println("student object serialized sucessfully");
				
	}

}
