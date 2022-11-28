package Loops;

public class ForEach {
	public static void main(String[] args) {
		int[] n= {100,200,300,400,500};
		/*for(int i=0; i<n.length;i++) {
			System.out.println(n[i]);
		}
		*/
		
		 //while
		
		int i=0;
		/*while(i<n.length) {
			System.out.println(n[i]);
			i++;
		}*/
		
		//do while
		
		/*do {
			System.out.println(n[i]);
			i++;
		}while(i<n.length);*/
		for(int num:n) {
			System.out.println(num);
		}
	}

}
