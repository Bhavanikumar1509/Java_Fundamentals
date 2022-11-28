package ExceptionHandling;
import java.util.Scanner;

public class Demonstration {
	public static void main(String[] args) {
	//	String message;
	//	Scanner sc=new Scanner(System.in);
	//	System.out.println("Enter Message;");
	//	message=sc.nextLine();
	//	System.out.println("Message:"+message);
		//sc.close();
	String message;
	try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter message");
		message=sc.nextLine();
		System.out.println("Message:"+message);
	}catch(Exception ex){
		System.out.println(ex.getMessage());
		
	}
	}

}
