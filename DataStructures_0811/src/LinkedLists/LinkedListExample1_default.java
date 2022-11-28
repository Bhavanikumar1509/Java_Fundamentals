package LinkedLists;
/*using default package
 * */
import java.util.*;
public class LinkedListExample1_default {
	public static void main(String[] args) {
		LinkedList<String>list1=new LinkedList<>();
		list1.add("king");
		list1.add("queen");
		list1.add("minister");
		LinkedList<Integer>list2=new LinkedList<>();
		list2.add(125);
		list2.add(564);
		list2.add(851);
		Iterator<Integer>iter1=list2.iterator();
		while(iter1.hasNext()) {
			System.out.println();
		}
	}

}
