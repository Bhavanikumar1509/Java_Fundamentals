package Misc;

public class FinalKeywordExample {
	final int count=100;
	public void setCount() {
		System.out.println(this.count);
		//Error; the final filed FinalKeywordExample.count cannit be assigned
		//count cant be changed
		//count+=200;
	}
	public static void main(String[] args) {
		FinalKeywordExample obj=new FinalKeywordExample();
		obj.setCount();
		
	}

}
