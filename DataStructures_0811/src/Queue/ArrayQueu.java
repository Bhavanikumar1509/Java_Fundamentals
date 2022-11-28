package Queue;

import java.util.Arrays;

class ArrayQueue{
	private int[] items;
	private int rear;
	private int front;
	private int count;
	public ArrayQueue(int capacity) {
		items=new int[capacity];
	}
	//
	public void enqueue(int item) {
		if(count==items.length)
			throw new IllegalStateException();
		items[rear++]=item;
		count++;
	}
	//
	public int dequeue() {
		return items[front++];
		//other way
		
		
		
	}
	//peek
	public int Peek() {
		return items[front];
	}
	//isEmpty
	public boolean isEmpty() {
		return count==0;
	}
	//isFull
	public boolean isFull() {
		return front==rear;
	}
	@Override
	public String toString() {
		return "ArrayQueue [items=" + Arrays.toString(items) + "]";
	} 
	//
	public void traverse() {
		System.out.println("Elements");
		for(int i=front;i<rear;i++) {
			System.out.println(items[i]);
		}
	}
}

public class ArrayQueu {
	public static void main(String[] args) {
		ArrayQueue queue=new ArrayQueue(5);
		queue.enqueue(100);
		queue.enqueue(142);
		queue.enqueue(324);
		queue.enqueue(514);
		queue.enqueue(741);
		/*System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());*/
		System.out.println("Is empty:"+queue.isEmpty());
		System.out.println("___Elements____");
		System.out.println(queue);
		System.out.println("Is Fullof:"+queue.isFull());
		System.out.println("Peek of the queue:"+queue.Peek());
		
	}

}
