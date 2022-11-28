package Misc;
public class StaticBlankFInalVariable {
	static final int count;

	static {
		count=100;
	}
	public void setCount() {
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		FinalKeywordExample obj=new FinalKeywordExample();
		obj.setCount();
		
	}

}
