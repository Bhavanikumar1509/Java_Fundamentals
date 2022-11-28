package OOPS;

class Employee 
{
	private String firstName; // instance variable that stores the first name
	private String lastName; // instance variable that stores the last name
	private double monthlySalary; // instance variable
	public Employee (String fname, String lname, double msalary)
	{
		firstName = fname; 
		lastName = lname; 
		monthlySalary = msalary;
		
	}
	public void setFirstName (String fname)
	{
		firstName = fname;
		
	}
	public String getFirstName ()
	{
		return firstName;
	}
	public void setLastName (String lname)
	{
		lastName = lname;	
	}

	public String getLastName ()
	{
		return lastName;
	}
	public void setMonthlySalary (double msalary)
	{
		if (msalary < 0.0)
			monthlySalary = 0.0;
		monthlySalary = msalary;
		

	}
	public double getMonthlySalary ()
	{
		return monthlySalary;
	}
	
	public double getYearlySalary()
	{
		double yearlySalary = monthlySalary * 12;
		return yearlySalary;
	}
	public double getRaiseSalary()
	{
		double raise =  monthlySalary * 0.1 ;
		double raiseSalary = ( monthlySalary + raise ) * 12;
		return raiseSalary;
	}
	
}
public class Q2 {
	public static void main(String[] args) {
		Employee employee=new Employee("HArsha", "reddy", 2);
		 System.out.println(employee.getYearlySalary());
		System.out.println(employee.getRaiseSalary());
		
	}

}
