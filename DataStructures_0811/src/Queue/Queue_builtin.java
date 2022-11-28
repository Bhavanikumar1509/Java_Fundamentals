package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/*Queue works in FIFO(First - IN First our Manner)
 * Queue is Interface
 * Elements gets added in queue from Rear and 
 * Elements gets deleted from queue from front
 * Operations:
 * -enqueue-->to add element in queue
 * -dequeue-->to remove element from queue
 * -peek-->to return which element is ready to dequeu
 * -isempty-->to check whether queue is empty
 * -isFull-->
 * to check whether queue is full or not
 * 
 * */

public class Queue_builtin {
	public static void main(String[] args) {
		Queue<Integer>queue=new PriorityQueue<Integer>();
		queue.add(51);
		queue.add(13);
		queue.add(23);
		queue.add(17);
		System.out.println("head of the queue:"+queue.element());
		System.out.println("head off the queue:"+queue.peek());
		Iterator <Integer>iter=queue.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		queue.poll();
		queue.poll();
		queue.poll();
		System.out.println("Head of queue:"+queue.element());
	}

}
