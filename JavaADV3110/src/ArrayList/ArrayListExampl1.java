package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExampl1 {
	public static void main(String[] args) {
		List<String>arryList=new ArrayList<String>();
		arryList.add("sank");
		arryList.add("asd");
		arryList.add("zkm");
		arryList.add("oep");
		arryList.add("ersd");
		//Iterate ArrayList using for loop
		System.out.println("______for_______");
		for (int i=0;i<arryList.size();i++) {
			System.out.println(arryList.get(i));
		}
		
		System.out.println("______for each_______");
		for(String value:arryList) {
			System.out.println(value);
		}
		//iteraate using while loop
		System.out.println("______while_______");
		int count=0;
		while(count<arryList.size()) {
			System.out.println(arryList.get(count));
			count++;
		}
		System.out.println("______***Iterator**_______");
		Iterator<String>iterator=arryList.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
	}

}
