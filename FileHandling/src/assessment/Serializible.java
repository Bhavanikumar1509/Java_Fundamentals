package assessment;
import java.io.*;
public class Serializible {

	public static void main(String[] args) throws IOException {
		
		Employee e=new Employee(101,"nani","software",100);
		String name ="name";
		FileOutputStream outStream=new FileOutputStream("C:\\Users\\kbhav\\Desktop\\pend\\2.txt");
		ObjectOutputStream out=new ObjectOutputStream(outStream);
		out.writeObject(e);
		out.flush();
		out.close();
		outStream.close();
		System.out.println("student object serialized sucessfully");
	}

}
