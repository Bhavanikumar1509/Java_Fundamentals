package user_inputs;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer_reader {
	public static void main(String[] args)throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name:");
		String name=reader.readLine();
		System.out.print("Enter your age:");
		int age=Integer.parseInt(reader.readLine());
		System.out.println("your name:"+name);
		System.out.println("your age:"+age);
		
	}

}
