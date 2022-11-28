package Assig_311;
class Circle{
	private double radius=1.0;
	private String color="red";
	Circle() {
		  double radius=this.radius;
		 String color=this.color;
		 
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public  void display() {
		System.out.println("radius of a Circle:"+this.radius);
		System.out.println("Color of a circle:"+this.color);
		System.out.println("area of a circle:"+getArea());
		
	}
}

public class Assing_1 {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.display();
		c.setRadius(10);
		c.getArea();
		c.display();
		
	}

}
