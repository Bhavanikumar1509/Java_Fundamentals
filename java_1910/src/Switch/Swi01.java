package Switch;
import java.util.*;

import javax.swing.text.DefaultTextUI;
//switch wworks for menu driven applications

public class Swi01 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		System.out.println("----choose your option----");
		System.out.println("1-Deposit");
		System.out.println("2-Withdrawl");
		System.out.println("3-Balance");
		System.out.println("enter choice:");
		int n=a.nextInt();
		switch(n) {
		case 1:
			System.out.println("deposited amount");
			break;
		
		case 2:
			System.out.println("withdrawn amount ");
			break;
		case 3:
			System.out.println("Balance amount");
			break;
		default:
			System.err.println("Invalid choice");
			break;
		}
	}

}
