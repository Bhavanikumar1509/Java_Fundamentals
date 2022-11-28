package collections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String>Prelist=new LinkedList<String>();
		Prelist.add("Amit");
		Prelist.add("solo");
		LinkedList<String>list=new LinkedList<String>();
		list.add("Nani");
		list.add("king");
		list.add("queen");
		list.addFirst("Deepa");
		list.addLast("Gua");
		list.addAll(Prelist);
		System.out.println(list);
		
		//To get element from the sepecific index
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		System.out.println("Get first:"+list.getFirst());
		System.out.println("Get last:"+list.getLast());
		
		//update the list
		list.set(2, "guna");
		System.out.println(list);
		
		//to check whther contains the elemtn or not
		Object obj=list.poll();
		System.out.println("Element removed is:"+obj);
		obj=list.pollFirst();
		System.out.println("Element removed  First is:"+obj);
		obj=list.pollLast();
		System.out.println("Element removed LAst is:"+obj);
		System.out.println(list);
		
		//To check whether contains the element or not
		System.out.println(list.contains("guna"));
		
		//remove elements from list
		list.remove("solo");
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.removeAll(Prelist);
		System.out.println(Prelist);
		Prelist.clear();
		System.out.println(Prelist);
		System.out.println(list);
		
		
		
	}

}
