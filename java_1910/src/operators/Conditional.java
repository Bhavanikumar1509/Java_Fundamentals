package operators;

public class Conditional {
	public static void main(String[] args) {
		float sellingPrice=1200;
		float costPrice=1000;
		if(sellingPrice>=costPrice) {
			if(sellingPrice!=costPrice) {
				System.out.println("proft");
			}
			else {
				System.out.println("nor pofit no loss");
			}
		}
		else {
			System.out.println("loss");
	
		
	}
	//output : profit, no profit no loss
	}

}
