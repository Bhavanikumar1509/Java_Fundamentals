package Overloading;
class Calculate{
	public void addition(int num1,int num2) {
		System.out.println("the sum of two integer numbers:"+(num1+num2));
	}
	public void addition(float num1,float num2) {
		System.out.println("the sum of two float numbers:"+(num1+num2));
		
	}
	public void addition(int num1,int num2,int num3) {
		System.out.println("thee sum of three integers:"+(num1+num2+num3));
		
	}
	public void addition(int num1,float num2) {
		System.out.println("the sum of int and float:"+(num1+num2));
		
	}
	public void addition(float num1,int num2) {
		System.out.println("the sum of float and int:"+(num1+num2));
		
	}
}

public class MethodOverload {
	public static void main(String[] args) {
		Calculate c=new Calculate();
		c.addition(100, 200);
		c.addition(11.2F, 13.34F);
		c.addition(200, 300, 400);
		c.addition(11.3F, 16);
		c.addition(15, 15.3F);
	}

}
