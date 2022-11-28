package complexities;
class Array{
	private  int[] items;
	private int[] items2;
	private int count;
	public Array(int length) {
		items=new int[length];
		count=0;
	}
	public void print() {
		for(int i=0;i<count;i++) {
			System.out.println(items[i]);
		}
	}
	public void insert(int item) {
		if(items.length==count) {
			int[] item2=new int[count*2];
			for(int i=0;i<count;i++) 
				item2[i]=items[i];
			items=item2;
			}	
		items[count++]=item;
	}
	public void RemoveAtIndex(int index) {
		if(index<0 || index>count) {
			throw new IllegalArgumentException();
		}
		else {
			int[] Array2 = new int[count];
			for (int i = 0, k = 0; i < count; i++) {
	            if (i == index) {
	                continue;
	            }
	            Array2[k++] =items[i];
	        }
			items=Array2;
		}
	}
	public void Max() {
		int largest=0;
		for(int i=0;i<items.length;i++) {
			if(items[i]>largest) {
				largest=items[i];
			}
		}
		System.out.println("Largest NUmber in Array:"+largest);
	}
	public void Intersect(int[] items, int[] items2) {
		for(int i=0;i<items.length;i++) {
			for(int j=0;i<items2.length;j++) {
				if(items[i]==items[j]) {
					System.out.println(items[i]);
				}
			}
		}
		
		
	}
	public void reverse() {
		int[] reverse=new int[count];
		int k=count;
		for(int i=0;i<count;i++) {
			reverse[k-1]=items[i];
			k-=1;
		}
		items=reverse;
	}
	public void Insert(int item,int index) {
		if(index<0 || index>count) {
			throw new IllegalArgumentException();
		}
		else {
		if(items.length==count) {
			int[] item2=new int[count*2];
			for(int i=0;i<count;i++) 
				if (i == index) {
					item2[i]=items[i];
				}
			items=item2;
		}
		items[count++]=item;
	
		}
	}
	
}

public class Array_operations {
	public static void main(String[] args) {
		Array array1=new Array(5);
		array1.insert(120);
		array1.insert(12);
		array1.insert(17);
		array1.insert(61);
		array1.insert(75);
		array1.insert(93);
		array1.RemoveAtIndex(2);
		array1.print();
		array1.Max();
		
		array1.reverse();
		array1.print();
		
		
		
		
		
	}
	
	

}
