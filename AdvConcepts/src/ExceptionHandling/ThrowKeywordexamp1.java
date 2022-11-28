package ExceptionHandling;
class MyException extends Exception{
	public MyException() {
		super("Not valid to vote");
	}
	public MyException(String message) {
		super(message);
	}
}
class Calculate{
	public static void validate(int age) throws MyException {
		if(age>=18) {
			System.out.println("you are allowed to this site");
		}
		else
			//throw new MyExcecption ("please enter right gae")
			throw new MyException();
	}
}
public class ThrowKeywordexamp1 {
	public static void main(String[] args) throws MyException {
		try {
			Calculate.validate(17);
		}catch (MyException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
