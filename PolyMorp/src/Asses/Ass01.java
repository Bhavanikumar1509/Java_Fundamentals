package Asses;
class Account{
	int amount;
	String Maturity_date,Opening_date;
	public void display() {
		System.out.println("Amount:"+amount);
		System.out.println("Maturity_date:"+Maturity_date);
		System.out.println("Opening_date:"+Opening_date);
		
	}
}
abstract class deposit extends Account{
	public deposit(int amount,String Maturity_date,String Opening_date) {
		this.amount=amount;
		this.Maturity_date=Maturity_date;
		this.Opening_date=Opening_date;
		
	}
	@Override
	public void display() {
		System.out.println("Amount:"+amount);
		System.out.println("Maturity_date:"+Maturity_date);
		System.out.println("Opening_date:"+Opening_date);
		
	}
	
}
class SavingAccount extends deposit{

	public SavingAccount(int amount, String Maturity_date, String Opening_date) {
		super(amount, Maturity_date, Opening_date);
		this.amount=amount;
		this.Maturity_date=Maturity_date;
		this.Opening_date=Opening_date;
	}
	
}
class ShortTerm extends deposit{
	protected int months;
	public ShortTerm(int amount, String Maturity_date, String Opening_date,int months) {
		super(amount, Maturity_date, Opening_date);
		this.months=months;
		
	}
	@Override
	public void display() {
		System.out.println("Amount:"+amount);
		System.out.println("Maturity_date:"+Maturity_date);
		System.out.println("Opening_date:"+Opening_date);
		System.out.println("months:"+months);
		
	}
	}
	
class LongTerm extends deposit{
	protected int years;
	public LongTerm(int amount, String Maturity_date, String Opening_date, int years) {
		super(amount, Maturity_date, Opening_date);
		this.years=years;
		
	}
	
	@Override
	public void display() {
		System.out.println("Amount:"+amount);
		System.out.println("Maturity_date:"+Maturity_date);
		System.out.println("Opening_date:"+Opening_date);
		System.out.println("years:"+years);
		
	}
}



public class Ass01 {
	public static void main(String[] args) {
		System.out.println("_______short term_____");
		ShortTerm St=new ShortTerm(100, "12-04-2022", "13-01-2021", 10);
		St.display();
		System.out.println("_________long term______");
		LongTerm Lt=new LongTerm(200,"14-2022", "14-02-2020", 2);
		Lt.display();
	}

}
