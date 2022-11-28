package collections;
import java.util.*;
public class LinkedHashset {
	public static void main(String[] args) {
		LinkedHashSet<String>list=new LinkedHashSet<>();
		list.add("king");
		list.add("queen");
		list.add("minister");
		list.add("soldier");
		System.out.println(list);
		list.add("king");
		System.out.println(list);
		list.add(null);
		list.add(null);
		System.out.println(list);
		System.out.println("_________Iteration____");
		Iterator<String>iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
