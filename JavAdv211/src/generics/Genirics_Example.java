package generics;
/*
 * the generics collection were introduced from java 5 onwards
 * the geenric collections allow the data types to pass as parameters to the classes and methods
 * the generic collection diable the type-casting usage unneccasirily
 * the generic collections are type safe and checked at compiler time
 * the generic collections syntax:
 * 			class<datatype>,interface<data-type>
 * Elements to be used while creating user defined generics
 * T-Type
 * E-Element(value)
 * K-key
 * N-number
 * V-Value
 *
 * */
class Test<T>{
	T value;
	String message;
	Test(T value,String message){
		this.value=value;
		this.message=message;
	}
	public Test() {
		
	}
	public T getValue() {
		return this.value;
	}
	public String getMessage() {
		return this.message;
	}
}
public class Genirics_Example {
	
	public static void main(String[] args) {
		Test<Integer>test=new Test<Integer>(10,"hello");
		System.out.println("Value Returned:"+test.getValue());
		System.out.println("Message returned:"+test.getMessage());
		Test<String >test1=new Test<String>("hey","hello");
		System.out.println("Value Returned:"+test1.getValue());
		System.out.println("Message returned:"+test1.getMessage());
		
	}
	

}
