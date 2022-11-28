package Assignments;

import java.util.Scanner;
public class Q4 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int sum=num1+num2;
			int product=num1*num2;
			int difference=num1-num2;
			float division=num1/num2*2F;
			System.out.println("sum:"+sum);
			System.out.println("Product:"+product);
			System.out.println("difference:"+difference);
			System.out.println("division:"+division);
			sc.close();
	
}
}