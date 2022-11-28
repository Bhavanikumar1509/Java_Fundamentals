package FileHandlingExamp1;
import java.io.*;
public class ByteStreamWriteFile {
	public static void main(String[] args) {
		//output stream:writing into the file
		//inputstream:reading from the file
		try(OutputStream outStream=new FileOutputStream("C:\\\\Users\\\\kbhav\\\\Desktop\\\\pend\\\\1.txt")){
			try(Writer writer=new OutputStreamWriter(outStream)){
				writer.write("\nhello world\n");
				writer.write("\nhello everyone\n");
			}catch(IOException e) {
				System.out.println(e.getMessage());
				
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
