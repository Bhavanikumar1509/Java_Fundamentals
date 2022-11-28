/*package Singleton;
class singleton{
	//Static variable reference of same class(Type Singleton)
	private static singleton single_instance=null;
	//Declaring a string variable
	private String str;
	//Private Constructor to restrict the class instantiation
	private singleton() {
		str="hellow ,iam a private constructor";
		
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
		//method that returns single instance of the class
		public static singleton getInstance(){
			if(single_instance==null)
				single_instance=new singleton();
			return single_instance;
		
	}
}

public class SingletonClassExample {
	public static void main(String[] args) {
		singleton obj1=singleton.getInstance();
		singleton obj2=singleton.getInstance();
		singleton obj3=singleton.getInstance();
		if(obj1==obj2 && obj2 ==obj3) {
			System.out.println("All objects poiunts to the sme meory location");
		}
		else {
			System.out.println("All objects doesn't point to the same memory");
		}
		System.out.println(obj1.getStr());
	}

}
*/
