package generics;
class Calculation<T,U>{
	T value1;
	U value2;
	public Calculation(T value1, U value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
		
	}
	public void display() {
		System.out.println("value1:"+this.value1);
		System.out.println("value2:"+this.value2);
		System.out.println("res:"+this.value1+this.value2);
	}
}

public class GenericClassMultipleTypeExample {
	public static void main(String[] args) {
		Calculation<Integer,Integer> test1=new Calculation<Integer,Integer>(100, 600);
		test1.display();
		Calculation<Float,Float> test2=new Calculation<Float,Float>(10.05F, 60.05F);
		test2.display();
	}

}
