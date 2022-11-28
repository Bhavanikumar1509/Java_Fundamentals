package FileHandlingExamp1;
import java.io.*;

public class CharacterStreamRead {
	public static void main(String[] args) {
		try(FileReader reader=new FileReader("C:\\Users\\kbhav\\Desktop\\pend\\1.txt")){
			int data;
			while((data=reader.read())!=-1) {
				System.out.println((char)data);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
