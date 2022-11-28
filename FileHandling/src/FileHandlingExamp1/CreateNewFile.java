package FileHandlingExamp1;
import java.io.File;
import java.io.IOException;


public class CreateNewFile {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\kbhav\\Desktop\\pend\\1.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("file created sucessfully");
			}else {
				System.out.println("Already Exists");
			}
		}catch(IOException e){
			System.out.println(e.getMessage());
			
		}
	}

}
