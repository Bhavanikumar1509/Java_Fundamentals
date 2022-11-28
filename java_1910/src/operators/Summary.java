package operators;
import java.util.*;

public class Summary {
	public static void main(String[] args) {
		float tax_per=0,tax;
		Scanner a=new Scanner(System.in);
		System.out.println("enter age:");
		int age =a.nextInt();
		System.out.println("enter income");
		int income=a.nextInt();
		if(age<60) {
			if(income<=250000) {
				tax_per=0;
			}
			else if(income >=250001 && income<=500000) {
				tax_per=0.1F;
			}
			else if(income>=500001 && income<=1000000){
				tax_per=0.2F;
				
			}
			else {
				tax_per=0.3F;
			}
		}
		else if(age>=60 && age<80) {
			if(income<=300000) {
				tax_per=0;
			}
			else if(income>=300001 && income <=500000) {
				tax_per=0.1F;
			}
			else if(income>=500001 && income <=1000000) {
				tax_per=0.2F;
			}
			else {
				tax_per=0.3F;
			}
		}
		else {
			if(income<=500000) {
				tax_per=0;
			}
			else if(income>=500001 && income<=1000000) {
				tax_per=0.2F;
			}
			else {
				tax_per=0.3F;
			}
		}
		
		
		tax=tax_per*income;
		System.out.println("Tax:"+tax);
		a.close();
		
		
	}

}
