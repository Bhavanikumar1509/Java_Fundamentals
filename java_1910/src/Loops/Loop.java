package Loops;
import java.util.*;

public class Loop {
	public static void main(String[] args) {
		/*
		 * 
		 *  for loop
		 *  
		 *  for (int i=0;i<=10;i++) {
			//System.out.println("hello "+i);
		//}
		Scanner a=new Scanner(System.in);
		int n;
		for(int i=1;i<=5;i++) {
			System.out.println("enter the number:");
			n=a.nextInt();
			if(n%5==0) {
				System.out.println("divisble by five");
			}
			else {
				System.out.println("no divisible");
			}
			
		}
		a.close();*/
		
		
		// While loop
		/*Scanner a=new Scanner(System.in);
		int i=1,value=0;
		while(i<=5) {
			System.out.println("enter the value:");
			value=a.nextInt();
			if(value%5==0) {
				System.out.println("divisble");
			}
				else {
					System.out.println("not divisble");
					
				}
			i=i+1;
			
		}*/
		Scanner a=new Scanner(System.in);
		int value=0;
		String choice="y";
		while(choice.equals("y")||choice.equals("Y") ||choice.equals("yes")||choice.equals("Yes")||choice.equals("YES")) {
			System.out.println("enter the value:");
			value=a.nextInt();
			if(value%5==0) {
				System.out.println("divisble");
			}
				else {
					System.out.println("not divisble");
					
				}
			a.nextLine();
			System.out.println("do you wish to continue?");
			choice=a.nextLine();
			
		}
		
		
	}

}
