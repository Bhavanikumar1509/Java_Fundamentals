package operators;
import java.io.*;
import java.util.*;

public class ASS02 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int sellingPrice,costPrice;
		System.out.println("enter selling price:");
		sellingPrice=a.nextInt();;
		System.out.println("enter cost price");
		costPrice=a.nextInt();
		if(sellingPrice>costPrice) {
			System.out.println("profit");
		}
		else if(sellingPrice<costPrice) {
			System.out.println("loss");
		}
		else {
			System.out.println("no profit nor losss");
		}
		String res=(sellingPrice>costPrice)?"profit": (sellingPrice<costPrice)? "loss":"no profit nor loss";
		System.out.println(res);
	}
	

}
