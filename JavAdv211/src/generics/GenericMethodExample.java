package generics;
class MyClass{
	static<T> void display(T value1,T value2){
		System.out.println(value1.getClass().getCanonicalName()+":"+value1);
		System.out.println(value2.getClass().getCanonicalName()+":"+value2);		
	}
	/*define a method that prints array elements ,type of Array is geenric and passed as parameter
	 * */
	static <T> void diaply1(T [] a) {
		System.out.println(a.toString(a));
		
	}
}

public class GenericMethodExample {
	
	public static void main(String[] args) {
		MyClass.display(100,405.43F);
		int[] a= {1,2,3,4,5};
		MyClass.diaply1(a.toString());
		
	}

}
