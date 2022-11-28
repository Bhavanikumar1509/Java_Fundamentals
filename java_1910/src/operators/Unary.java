package operators;

public class Unary {

	public static void main(String[] args) {
		//when we use increment or decrement operators which are unary operators
		//the value of the operand increase or decrease by one
		int n=100,res=0;
		//postincrement
		res=n++;
		System.out.println(n); //101
		System.out.println(res);//100
		//pre increment
		res=++n;
		System.out.println(n);//102
		System.out.println(res);//102
		
		
		//postdecrement
		res=n--;
		System.out.println(n);//101
		System.out.println(res);//102
		//pre decrement
		res=--n;
		System.out.println(n);//100
		System.out.println(res);//100
	}
}
