package Loops;

public class ASS01 {
	public static void main(String[] args) {
		int[] numbers= {100,200,300,400,500};
		int sum=0;
		/*System.out.println("____for loop___");
		for(int i=0; i<numbers.length;i++) {
			sum=sum+numbers[i];
		}
		System.out.println(sum);
	System.out.println("____while___");
	int i=0;
	while(i<numbers.length) {
		sum=sum+numbers[i];
		i++;
	}
	System.out.println(sum);
	}
*/
	/*do {
		sum=sum+n[i];
		i++;
	}while(i<numbers.length);
	System.out.println(sum);*/
	
	for (int num:numbers) {
		sum=sum+num;
	}
	System.out.println(sum);
	}
}
