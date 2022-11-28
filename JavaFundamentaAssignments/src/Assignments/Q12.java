package Assignments;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);  
        String str; 
        System.out.printf("Enter String: ");
        str=input.nextLine();
        System.out.printf("%s%s",str.toUpperCase(),str.toLowerCase());
        input.close();
	}

}
