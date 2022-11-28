package Loops;

import java.util.Scanner;

public class Dowh {
	public static void main(String[] args) {
		int value=0;
		String choice="y";
		Scanner a=new Scanner(System.in);
		do {
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
			choice=a.nextLine();;
		}while(choice.equals("y")||choice.equals("Y") ||choice.equals("yes")||choice.equals("Yes")||choice.equals("YES"));
	}

}
