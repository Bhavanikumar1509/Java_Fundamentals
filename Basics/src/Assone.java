
public class Assone {
public static void main(String[] args) {
	boolean loggedInEmail=true;
	boolean loggedInGoogle=true;
	boolean loggedInFacebook=true;
	if(loggedInEmail || loggedInFacebook || loggedInGoogle) {
		System.out.println("allow acess");
	}
	else {
		System.out.println("dont' allow");
	}
}
}
