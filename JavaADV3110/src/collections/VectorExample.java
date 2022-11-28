package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<String>();
		vector.addElement("king");
		vector.addElement("queen");
		vector.addElement("minister");
		vector.addElement("soldier");
		vector.addElement("Spy");
		
		System.out.println("Vector elements:"+vector);
		System.out.println("Sizeof vector:"+vector.size());
		System.out.println("Capacity:"+vector.capacity());
		System.out.println("_________enumeration___");
		Enumeration<String>enumeration=vector.elements();
		System.out.println("vector elements:");
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		System.out.println("______Iterator___");
		Iterator<String>iterator=vector.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("______ForLoop___");
		for(int i=0;i<vector.size();i++) {
			System.out.println(vector.get(i));
		}
		System.out.println("______For eachLoop___");
		for(String names:vector) {
			System.out.println(names);
		}
		System.out.println("______ while Loop___");
		int count=0;
		while(count<vector.size()) {
			System.out.println(vector.get(count));
			count++;
		}
	}

}
