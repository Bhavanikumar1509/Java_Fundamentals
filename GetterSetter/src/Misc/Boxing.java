package Misc;

public class Boxing {
	public static void main(String[] args) {
		//Primituve Type
		int num=100;
		
	//converting primitive type into object (Boxing)
		Integer number=Integer.valueOf(num);
		System.out.println(num);
		System.out.println(number);
		System.out.println(number.getClass().getSimpleName());
		System.out.println("______________________________");
		//Automatically assigns as object after conversion(Auto boxing)
		Integer anotherNumber=num;
		System.out.println(num);
		System.out.println(number);
		System.out.println(anotherNumber);
		System.out.println(anotherNumber.getClass().getSimpleName());
		System.out.println("______________________________");
		//converting an objective into primitive type
		int unboxValue=number.intValue();
		System.out.println(unboxValue);
	}
	

}
