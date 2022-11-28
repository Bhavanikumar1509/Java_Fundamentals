package Serializible;
import java.io.*;
public class DeserializationExamp1 {
	public static void main(String[] args) {
		FileInputStream inStream=new FileInputStream("C:\\Users\\kbhav\\Desktop\\pend\\");
		ObjectInputStream in=new ObjectInputStream(inStream);
		Student student=(Student)in.readObject();
		System.out.println(student);
		in.close();
		inStream.close();
	}

}
