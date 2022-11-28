package TypeCast;
//used to convert the data type of a varibale depending upon the calculation and evaluation
//two types--implicit and explicit
//implicit -->performed by compiler 
//explicit -->performed by developer -->chances of data loss



public class Typecast {
	public static void main(String[] args) {
		/*implicit (widening)
		
		int n1=100;
		float n2=n1;
		System.out.println(n2);*/
		
		/*explicit*///(narrow)
		float n1=100.45F;//float size is greater than int ..so there may be data loss
		int n2=(int) n1;//we need to manually convert the float to int
		System.out.println(n2);
		
		
	}

}
