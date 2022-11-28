package Misc;

public class BlankFInalVaribaleExample {
	final int count;
	
	public BlankFInalVaribaleExample() {
		this.count=100;
	}
	public void setCount() {
		System.out.println(this.count);
		
	}
	public static void main(String[] args) {
		FinalKeywordExample obj=new FinalKeywordExample();
		obj.setCount();
		
	}

}
