package Assig_311;
class Addition{
	int num1,num2,num3;

	public Addition(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public Addition(int num1, int num2, int num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	public void display1() {
		int sum=num1+num2;
		System.out.println("two numberS:"+sum);
	}
	public void display2() {
		int sum=num1+num2+num3;
		System.out.println("two numberS:"+sum);
	}
}

public class Assign_2 {
	public static void main(String[] args) {
		Addition add1=new Addition(1,2);
		add1.display1();
		Addition add2=new Addition(3, 4,5);
		add2.display2();
		
	}

}
