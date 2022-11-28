package OOPS;
class SavingsAccount {
	private static float annualIntrestRate;
	private float savingsBalance;
	private float monthlyIntrest;

	public SavingsAccount(float balance) {
		this.savingsBalance = balance;
	}
	public  void modifyInterestRate(float interestRate) {
		annualIntrestRate = interestRate / 100; 
	}
	public void calculateMonthlyInterest() {
		monthlyIntrest = savingsBalance * annualIntrestRate / 12;
		System.out.println("The monthly intrest is: $" + monthlyIntrest);
	}
	private void calculateSavings() {
		savingsBalance += monthlyIntrest;
	}
	public void displaySavings() {
		calculateSavings();
		System.out.println("The total balance is : $ " + savingsBalance);
	}

}
public class Q4 {
	public static void main(String[] args) {
		SavingsAccount serer1=new SavingsAccount(2000);
		SavingsAccount serer2=new SavingsAccount(3000);
		System.out.println("_______server1____4%___");
		serer1.modifyInterestRate(4);
		serer1.calculateMonthlyInterest();
		serer1.displaySavings();
		System.out.println("_______server2____4%___");
		serer2.modifyInterestRate(4);
		serer2.calculateMonthlyInterest();
		serer2.displaySavings();
		System.out.println("_______server1____5%___");
		serer1.modifyInterestRate(5);
		serer1.calculateMonthlyInterest();
		serer1.displaySavings();
		System.out.println("_______server2____5%___");
		serer2.modifyInterestRate(5);
		serer2.calculateMonthlyInterest();
		serer2.displaySavings();
	}

}
