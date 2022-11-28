package Assignments;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num2%num1==0 || num1%num2==0) {
			System.out.println("they are  multiples");
		}
		else {
			System.out.println("they are not multiples");
		}
		sc.close();
	}

}
