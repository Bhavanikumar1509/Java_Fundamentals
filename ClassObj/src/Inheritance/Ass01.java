package Inheritance;
import java.util.*;
class Car{
	private int speed;
	private double regularPrice;
	private String color;
	Scanner sc=new Scanner(System.in);
	public void acceptDetails() {
		System.out.print("enter Speed:");
		this.speed=sc.nextInt();
		System.out.print("enter Regularprice:");
		this.regularPrice=sc.nextDouble();
		System.out.print("enter color:");
		this.color=sc.next();
	}
	public double getSalePrice(){
		return this.regularPrice;
		
		
	}
}
class Truck extends Car{

	private int weight;
	public void acceptDetails() {
		System.out.println("Enter weight in the truck:");
		this.weight=sc.nextInt();
	}
	public double getSalePrice() {
		super.getSalePrice();
		if(this.weight>2000) {
			return super.getSalePrice()-(super.getSalePrice()*0.1);	
		}
		else {
			return super.getSalePrice()-((super.getSalePrice()*0.2));
		}
		
	}	
	
}
class Ford extends Car{
	private int year;
	int manufacturingDiscount;
	public void acceptDetails() {
		super.acceptDetails();
		System.out.println("Enter year of Manufacuring:");
		this.year=sc.nextInt();
		System.out.println("Enter Manufacuring Discount:");
		this.manufacturingDiscount=sc.nextInt();
		
	}
	public double getSalePrice() {
		
		return super.getSalePrice()-manufacturingDiscount;
	}
}
class Seden extends Car{
	private int length;
	public void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Length:");
		this.length=sc.nextInt();
	}
	public double getSalePrice() {
		super.getSalePrice();
		if(this.length>20) {
			return super.getSalePrice()-super.getSalePrice()*0.05;
			
		}
		else {
			return super.getSalePrice()-super.getSalePrice()*0.1;
		}
}
}
public class Ass01 {
	public static void main(String[] args) {
		Seden s=new Seden();
		Ford f=new Ford();
		s.acceptDetails();
		s.getSalePrice();
		
	}

}
