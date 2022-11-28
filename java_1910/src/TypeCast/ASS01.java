package TypeCast;

public class ASS01 {
	public static void main(String[] args) {
		//explicit
		byte num1=10;
		byte num2=20;
		byte num3=(byte)(num1+num2);
		System.out.println(num3);
		//implicit
		byte n1=100;
		byte n2=127;
		int n3=n1+n2;
		System.out.println(n3);
	}

	//byte,short,char --these data types gets converted into integers before calculation
}
