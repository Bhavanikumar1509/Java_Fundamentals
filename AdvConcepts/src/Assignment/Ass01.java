package Assignment;
import java.util.Scanner;
class BothAreSame extends Exception{
	public BothAreSame() {
		super("Both can't be Same");
	}
	public BothAreSame(String message) {
		super(message);
	}
	
}
class NegativeException extends Exception{
	public NegativeException() {
		super("Negative values");
		
	}
	public NegativeException(String message) {
		super(message);
		
	}
}
public class Ass01 {
	public static void main(String[] args){
		int SellingPrice,CostPrice;
		try(Scanner sc=new Scanner(System.in)){
		System.out.print("Enter the SellingPrice:");
		SellingPrice =sc.nextInt();
		System.out.print("Enter the CostPrice:");
		CostPrice=sc.nextInt();
		if(SellingPrice>CostPrice) {
				System.out.println("Profits");	
		}
		else if(SellingPrice<0 || CostPrice<0){
			
			throw new NegativeException();
		}
		else if(SellingPrice==CostPrice) {
				
				throw new BothAreSame();
		}
				
		else{
				System.out.println("Loss");
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}


