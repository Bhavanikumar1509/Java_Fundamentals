package Overloading;
class Test{
	public void  test() {
		System.out.println("no parameters");
	}
	public void  test(double test) {
		System.out.println("double inside method");

	}
	public void test(int n1,int n2) {
		System.out.println("n1:"+n1+"\tn2:"+n2);
	}
	
}

public class MetOverload {
	public static void main(String[] args) {
		Test T=new Test();
		T.test();
		T.test(50);
		T.test(12,13);
		T.test(13,14);
	}

}
