package Assignments;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double Fahrenheit;
		System.out.print("Enter Fahrenheit:");
		Fahrenheit=sc.nextInt();
		float a=5/9F;
		double celcius=a*(Fahrenheit - 32);
		System.out.print("celcius :"+celcius);
		sc.close();
	}

}
