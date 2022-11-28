import java.util.*;
public class BreakContinue {
	public static void main(String[] args) {
		//terminates the program or loop immediately 
		//and moves to the next statement following after the loop
		int num;
		Scanner sc=new Scanner(System.in);
		String choice="y";
		while(choice.equals("y")||choice.equals("Y") ||choice.equals("yes")||choice.equals("Yes")||choice.equals("YES")) {
			System.out.println("enter the number:");
			num=sc.nextInt();
			if(num>100) {
				
				System.out.println("loop terminated..");
				break;
			}
			else {
				if(num%5==0) {
					System.out.println("divisble");
				}
				else {
					System.out.println("Not divisble");
				}
			}
			sc.nextLine();
			System.out.println("do you wish to continue?");
			choice=sc.nextLine();
			
		}
	}

}
