package Assignments;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int counter=0;
		int larger=0;
		int num;
		while(counter<10) {
			num=sc.nextInt();
			if(num>larger) {
				larger=num;
			}
			counter+=1;
		}
		System.out.println("Larger number is:"+larger);
		sc.close();
	}

}
