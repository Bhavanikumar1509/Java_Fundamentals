package Assig_311;
interface IAccount{
	public int getBalance();
	public void deposit(int amount);
	public void withdraw(int amount);
}
class HDFCAccount implements IAccount{
	int deposits;
	int withdrawals;
	@Override
	public int getBalance() {
		return deposits-withdrawals;
		
	}
	@Override
	public void deposit(int amount) {
		
		deposits+=amount;
	}
	@Override
	public void withdraw(int amount) {
		withdrawals+=amount;
		
	}
	
	
	
}
class StateBankAccount implements IAccount{
	int balance;

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void deposit(int amount) {
		balance+=amount;
		
	}

	@Override
	public void withdraw(int amount) {
		balance-=amount;
		
	}

	
	
}
public class Assign_5 {
	public static void main(String[] args) {
		IAccount account=new HDFCAccount();
		System.out.println("___HDFC_____");
		transactOnAccount(account);
		account =new StateBankAccount();
		System.out.println("______SBI______");
		transactOnAccount(account);
		
	}
	public static void transactOnAccount(IAccount account) {
		account.deposit(500);
		System.out.println("Deposited 500 on account"+account);
		account.withdraw(150);
        printBalance("withdrawing 150 from accountt", account);
        account.withdraw(200);
        printBalance("withdrawing 200 from account", account);
        account.deposit(750);
        printBalance("depositing 750 on account", account);
    }
    
    public static void printBalance(String message, IAccount account)
    {
        System.out.println("The balance after " + message + " is " + account.getBalance() +".");
    }
}


