package Assignments;

import java.util.Scanner;

class sphere{
	private double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double Volume() {
		float a=4/3F;
		return a*Math.PI*Math.pow(radius, 3);
	}
}

public class Q10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sphere sp=new sphere();
		System.out.print("Enter the Radius:");
		double radius=sc.nextDouble();
		sp.setRadius(radius);
		System.out.println("voulme of sphere:"+sp.Volume());
		
	}

}
