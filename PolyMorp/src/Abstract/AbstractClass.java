package Abstract;
abstract class ManageAccount{
	public static void WelcomeMessage() {
		System.out.println("Welcome to DEF Bank!!");
	}
	
	public abstract void openAccount();
	public abstract void closeAccount();
}
abstract class BankAccount extends ManageAccount{
	public abstract void deposit();
	public abstract void withdraw();
	public abstract void balance();
	
}
class SavingAccount extends BankAccount{
	@Override
	public void openAccount() {
		System.out.println("Opening Savings account");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit in savings account");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw from savings account");
		
	}

	@Override
	public void balance() {
		System.out.println("check balance in savings account");
	}

	

	@Override
	public void closeAccount() {
		System.out.println("closing the savings account");
		
	}
	
}
class CurrentAccount extends BankAccount{
	@Override
	public void openAccount() {
		System.out.println("opening the current account");
	}

	@Override
	public void deposit() {
		System.out.println("deposit in current account");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw from current account ");
		
	}

	@Override
	public void balance() {
		System.out.println("balance in current account");
		
	}


	@Override
	public void closeAccount() {
		System.out.println("closing the current account");
		
	}
	
}

public class AbstractClass {
	public static void main(String[] args) {
		ManageAccount.WelcomeMessage();
		CurrentAccount CA=new CurrentAccount();
		CA.openAccount();
		CA.balance();
		CA.deposit();
		CA.withdraw();
		CA.closeAccount();
		System.out.println("______________");
		SavingAccount SA=new SavingAccount();
		SA.openAccount();
		SA.balance();
		SA.deposit();
		SA.withdraw();
		SA.closeAccount();
	}

}
