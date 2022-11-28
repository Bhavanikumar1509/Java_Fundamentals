package user_inputs;

public class ConsoleClassExampl1 {
	public static void main(String[] args) throws NullPointerException {
		System.out.println("enter your name:");
		String username=System.console().readLine();
		System.out.println("enter password:");
		char[] password=System.console().readPassword();
		System.out.println("Username:"+username);
		System.out.printf("your username ",username);
		System.out.println("your password is"+password);
	}

}
