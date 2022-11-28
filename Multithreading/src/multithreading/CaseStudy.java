package multithreading;
import java.io.*;
import java.util.*;
class Bank extends Thread{
	int IntialBalance=500;
	int TotalBalance=IntialBalance;
	String WithdrawerName;
	int WithdrwanAmount;
	String DepositerName;
	int DepositAmount;
	public void Withdrawl(String WithdraweName,int WithdrwanAmount) {
		if(TotalBalance>=WithdrwanAmount) {
			System.out.println("Withdrawl..Transaction Complted...");
			TotalBalance-=WithdrwanAmount;
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Balance Insufficient");
		}
		
		}
	public void deposit(String DepositerName,int DepositAmount) {
		System.out.println(DepositerName+"  Deposited :"+DepositAmount);
		TotalBalance=IntialBalance+DepositAmount;
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
class ThreadWithdrawl extends Thread{
	Bank account;
	String accountName;
	int withdrawAmount;
	public ThreadWithdrawl(Bank account, String accountName, int withdrawAmount) {
		this.account = account;
		this.accountName = accountName;
		this.withdrawAmount = withdrawAmount;
	}
	@Override
	public void run() {
		account.Withdrawl(accountName,withdrawAmount);
		System.out.println("Remaining Balance:"+account.TotalBalance);
	}
	
	
}
class ThreadDeposit extends Thread{
	Bank account;
	String accountName;
	int depositAmount;
	
	public ThreadDeposit(Bank account, String accountName, int depositAmount) {
		this.account = account;
		this.accountName = accountName;
		this.depositAmount = depositAmount;
	}

	@Override
	public void run() {
		account.deposit(accountName,depositAmount);
	}
	
}
public class CaseStudy {
	public static void main(String[] args) {
		Bank b=new Bank();
		ThreadDeposit deposit1=new ThreadDeposit(b, "Nani", 100);
		ThreadWithdrawl withdrawl=new ThreadWithdrawl(b, "Harsha", 400);
		deposit1.setPriority(Thread.MAX_PRIORITY);
		withdrawl.setPriority(Thread.MAX_PRIORITY);
		deposit1.start();
		deposit1.yield();
		withdrawl.yield();
		withdrawl.start();

		
	}

}
