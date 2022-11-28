package FileHandlingExamp1;
import java.io.*;

public class CharacterStreamWriteFile {
	public static void main(String[] args) {
		try(Writer writer=new FileWriter("C:\\\\Users\\\\kbhav\\\\Desktop\\\\pend\\\\1.txt")){
			writer.write("\nthis is printed by character stream");
			writer.write("\nhello\n");
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
