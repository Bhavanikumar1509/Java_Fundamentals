package collections;
import java.util.*;
public class HashSetOperations {
	public static void main(String[] args) {
		Set<Integer> hashset1=new HashSet<Integer>();
		hashset1.add(100);
		hashset1.add(200);
		hashset1.add(300);
		hashset1.add(400);
		hashset1.add(500);
		hashset1.add(600);
		Set<Integer> hashset2=new HashSet<Integer>();
		hashset2.add(100);
		hashset2.add(200);
		hashset2.add(300);
		hashset2.add(400);
		hashset2.add(500);
		hashset2.add(700);
		//to find union between two sets
		Set<Integer>unionSet=new HashSet<Integer>(hashset1);
		unionSet.addAll(hashset2);
		System.out.println(unionSet);
		//to find intersection between two sets
		Set<Integer>intersectionSet=new HashSet<Integer>(hashset1);
		intersectionSet.retainAll(hashset2);
		System.out.println(intersectionSet);
		
		//to find symmetric difference between two sets
		Set<Integer>differenceSet=new HashSet<Integer>(hashset1);
		differenceSet.removeAll(hashset2);
		System.out.println(differenceSet);
	}
	

}
