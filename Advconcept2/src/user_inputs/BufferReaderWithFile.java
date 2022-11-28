package user_inputs;
import java.io.*;
public class BufferReaderWithFile {
	public static void main(String[] args) throws IOException{
		BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\kbhav\\Desktop\\pend\\1.txt"));
		int i;
		while((i=reader.read())!=-1) {
			System.out.println((char)i);
		}
		reader.close();
	}

}
