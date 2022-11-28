package Assignments;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int sum=num1+num2+num3;
		float average=sum/3F;
		int product=num1*num2*num3;
		System.out.println("sum is:"+sum);
		System.out.println("Average:"+average);
		System.out.println("product:"+product);
		if(num1>num2 && num1>num3) {
			System.out.println(num1+ " is larger");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is larger");
		}
		else {
			
			System.out.println(num3+" is larger");
		}
		if(num1<num2 && num1<num3) {
			System.out.println(num1+ " is smaller");
		}
		else if(num2<num1 && num2<num3) {
			System.out.println(num2+" is smaller");
		}
		else {
			
			System.out.println(num3+" is smaller");
		}
		sc.close();
	}

}
