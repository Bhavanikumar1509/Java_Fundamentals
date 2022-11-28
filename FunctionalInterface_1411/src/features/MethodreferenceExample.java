package features;

import java.util.function.BiFunction;

interface Printer{
	void print();
	
}
class ConsolePrinter{
	
	
	public ConsolePrinter() {
		super();
		System.out.println("constructor callingg...reference");
	}
	//Instance or Non-static method
	public void printMessage() {
		System.out.println("Non-static method calling...");
	}
	//static method
	public static void printSomething() {
		System.out.println("Iam printing");
	}
	//static method
	public static int addition(int num1,int num2) {
		return num1+num2;
	}
}
public class MethodreferenceExample {
	public static void main(String[] args) {
		//reference to the static method
		Printer printer=ConsolePrinter::printSomething;
		printer.print();
		//reference to the static method
		BiFunction<Integer,Integer,Integer>additioncall=ConsolePrinter::addition;
		int result=additioncall.apply(100, 200);
		System.out.println(result);
		
		
		//Referencce to an Instance method
		
		ConsolePrinter ref=new ConsolePrinter();
		Printer printer1=ref::printMessage;
		printer1.print();
		
		
		//Reference to a constructor
		Printer printer2=ConsolePrinter::new;
		printer2.print();
	}

}
