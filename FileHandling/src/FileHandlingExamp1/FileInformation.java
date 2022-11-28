package FileHandlingExamp1;
import java.io.File;

public class FileInformation {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\kbhav\\Desktop\\pend\\1.txt");
		if(file.exists()) {
			System.out.println("exists");
			System.out.println("File Name:"+file.getName());
			System.out.println("File path:"+file.getAbsolutePath());
			System.out.println("is readable?"+file.canRead());
			System.out.println("is writable?"+file.canWrite());
			System.out.println("lenght of file:"+file.length());
		}
		else {
			System.out.println("doesn't exists");
		}
	}

}
