package FileHandlingExamp1;
import java.io.*;

public class ByteStreamReadFile {
	public static void main(String[] args) {
		try(InputStream inStream=new FileInputStream("C:\\\\Users\\\\kbhav\\\\Desktop\\\\pend\\\\1.txt")){
			try(Reader reader=new InputStreamReader(inStream)){
				int data=reader.read();
				while(data!=-1) {
					System.out.println((char)data);
					data=reader.read();
				}
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
