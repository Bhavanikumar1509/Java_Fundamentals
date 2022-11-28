package operators;

public class Ass01 {
	public static void main(String[] args) {
		int a=1,b=2;
		int c,d;
		c=--b;//b=1,c=1
		d=a--;//d=1 and then decrease a=0
		c--;//c=0
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
