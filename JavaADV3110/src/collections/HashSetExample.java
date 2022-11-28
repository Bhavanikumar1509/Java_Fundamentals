package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> hashset=new HashSet<String>();
		hashset.add("king");
		hashset.add("queen");
		hashset.add("minister");
		hashset.add("soldier");
		hashset.add("spy");
		System.out.println("HashSet elements:"+hashset);
		hashset.add("king");
		System.out.println("after adding duplicate.but not taken:"+hashset);
		hashset.add(null);
		hashset.add(null);
		System.out.println(hashset);
	}

}
