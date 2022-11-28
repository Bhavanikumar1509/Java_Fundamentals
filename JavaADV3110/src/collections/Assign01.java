package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Assign01 {
	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.add("Nani");
		list.add("king");
		list.add("queen");
		list.addFirst("Deepa");
		list.addLast("Gua");
		System.out.println("_________for loop____");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("_________while loop____");
		int count=0;
		while(count<list.size()) {
			System.out.println(list.get(count));
			count++;
		}
		System.out.println("_________for eachloop____");
		for(String names:list) {
			System.out.println(names);
		}
		System.out.println("_________Iteration____");
		Iterator<String>iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
