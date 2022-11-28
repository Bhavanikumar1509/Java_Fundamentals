
interface ManageAccount{
	void openAccount();
	void closeAccount();
}


interface BankAccount{
	int rate_of_intrest=0;
	public static void welcomeMessage() {
		System.out.println("Welcome to ABC bank!!");
	}
	public default void welcome() {
		System.out.println("Default Welcome method here..");
	}
	void deposit();
	void withdraw();
	void balance();
}
class SavingAccount implements BankAccount,ManageAccount{
	@Override
	public void openAccount() {
		System.out.println("opening savings account");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit in saving acocunt");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw in savings account");
		
	}

	@Override
	public void balance() {
		System.out.println("balance in saving account ");
		
	}


	@Override
	public void closeAccount() {
		System.out.println("closing savings account");
	}
	
}
public class InterfaceOveriding {
	public static void main(String[] args) {
		SavingAccount sa=new SavingAccount();
		sa.welcome();
		sa.openAccount();
		sa.deposit();
		sa.balance();
		sa.withdraw();
		sa.closeAccount();
		
	}

}
