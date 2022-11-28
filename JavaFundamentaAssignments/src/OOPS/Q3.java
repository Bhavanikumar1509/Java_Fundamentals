package OOPS;
class Date {
	    private int month;
	    private int day;
	    private int year;
	    
	    public Date(int month, int day, int year){
	        this.month = month; 
	        this.day = day;
	        this.year = year;
	    }
	    
	    public void setMonth(int month){
	        this.month = month;
	    }
	    public void setDay(int day){
	        this.day = day;
	    }
	    public void setYear(int year){
	        this.year = year;
	    }
	    public int getMonth(){
	        return month;
	
	    }
	    public int getDay(){
	      return day;
	    }
	    public int getYear(){
	        return year;
	    }
	    public String displayDate(){
	
	        return month + "/" + day + "/" + year;
	   
	
	    }
}
public class Q3 {
	public static void main(String[] args) {
		Date date=new Date(9, 15, 2022);
		System.out.println(date.displayDate());
	}

}
