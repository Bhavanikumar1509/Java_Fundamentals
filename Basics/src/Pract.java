
public class Pract {
	public static void main(String[] args) {
		boolean isLoggedIn=true;
		boolean isEmailVerified=true;
		boolean isCardinfoValid=false;
		if(isLoggedIn && isEmailVerified && (!(isCardinfoValid))) {
			
			System.out.println("user can purchase");
		}
		else {
			System.out.println("user can't purcchse");
		}
	}

}
