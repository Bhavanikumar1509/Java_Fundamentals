package generics;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.css.Rect;

abstract class  Ishape{
	abstract void drawShape();
}
class Square extends Ishape{
	public void drawShape() {
		System.out.println("Drwaing Square");
	}
}

class Rectangle extends Ishape{
	
	@Override
	public void drawShape() {
		System.out.println("Rectangle");
		
	}
}

public class GenericWithWildcardExample {
	public static void drawing(List<? extends Ishape>shapeList) {
		for(Ishape shape:shapeList) {
			shape.drawShape();
		}
	}
	public static void main(String[] args) {
		List<Square>l1=new ArrayList<Square>();
		l1.add(new Square());
		l1.add(new Square());
		l1.add(new Square());
		l1.add(new Square());
		drawing(l1);
		List<Rectangle>l2=new ArrayList<Rectangle>();
		l2.add(new Rectangle());
		l2.add(new Rectangle());
		drawing(l2);
		
	}

}
