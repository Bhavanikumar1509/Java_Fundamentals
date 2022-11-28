package Test;
class Parent{
	public void method1() {
		System.out.println("parent method");
	}
}
class child1 extends Parent{
	public void method2() {
		System.out.println("child1 method");
	}
}
class child2 extends Parent{
	public void method3() {
		System.out.println("child2 method");
	}
}
public class Inheritence {
	public static void main(String[] args) {
		child2 c2=new child2();
		c2.method1();
		c2.method3();
		child1 c1=new child1();
		c1.method1();
		c1.method2();
	}

}
