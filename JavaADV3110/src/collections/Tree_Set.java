package collections;
import java.util.*;
public class Tree_Set {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(6);
		treeSet.add(8);
		treeSet.add(3);
		System.out.println(treeSet);
		System.out.println("____Iterator___");
		Iterator<Integer>iterator=treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//To check if treeset is empty or not
		if(treeSet.isEmpty())
			System.out.println("Empty");
		else
			System.out.println("Not empty");
		System.out.println("first elemt:"+treeSet.first());
		System.out.println("last elemt:"+treeSet.last());
		treeSet.remove(81);
		System.out.println(treeSet);
	}

}
