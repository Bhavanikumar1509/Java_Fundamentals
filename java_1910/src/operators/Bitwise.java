package operators;

public class Bitwise {
	public static void main(String[] args) {
		int n1=12,n=25;
		//bitwise or
		int res=n1|n;
		System.out.println(res);
		// 12 -->0b1100
		//25-->0b11001
		//12|25 -->0b11101 -->29
		//bitwise and
		int res1=n1&n;
		System.out.println(res1);
		int res2=n1^n;
		System.out.println(res2);
		
	}

}
