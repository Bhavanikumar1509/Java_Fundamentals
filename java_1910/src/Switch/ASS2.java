package Switch;
import java.util.*;

public class ASS2 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("----choose your option----");
		System.out.println("1-admin");
		System.out.println("2-subadmin");
		System.out.println("3-testprep");
		System.out.println("4-user");
		System.out.println("enter choice:");
		int n=a.nextInt();
		switch(n) {
		case 1:
			System.out.println("Full acess");
			break;
		
		case 2:
			System.out.println("Get Acess to create/delete courses ");
			break;
		case 3:
			System.out.println("get aacess to create/delete tests");
			break;
		case 4:
			System.out.println("get acess to consume content");
			break;
		default:
			System.err.println("Invalid choice");
			break;
		}
		a.close();
		
	}

}
