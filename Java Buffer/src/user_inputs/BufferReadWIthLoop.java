package user_inputs;
import java.io.*;

public class BufferReadWIthLoop {
	public static void main(String[] args)throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String message="";
		while(!message.equals("stop")) {
			System.out.print("Enter your message:");
			message=reader.readLine();
			System.out.println(message);
			
		}
	}


}
