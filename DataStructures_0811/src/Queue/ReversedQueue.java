package Queue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
class QueueReverser{
	public static void reverse(Queue<Integer> queue) {
		Stack<Integer>stack=new Stack<Integer>();
		while(!queue.isEmpty())
			stack.push(queue.remove());
		while (!stack.isEmpty())
			queue.add(stack.pop());
		
	}
	public static void reverseQueueKelements(int k,Queue<Integer> queue)
    {
        if (queue.isEmpty() == true || k > queue.size())
            return;
        if (k <= 0)
            return;
 
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.peek());
            queue.remove();
        }
        while (!stack.empty()) {
            queue.add(stack.peek());
            stack.pop();
        }
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
    }
}

public class ReversedQueue {
	public static void main(String[] args) {
		Queue<Integer>queue=new ArrayDeque<Integer>();
		queue.add(674);
		queue.add(154);
		queue.add(226);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println("Orignal queue:");
		for(Integer i:queue) {
			System.out.println(i);
		}
//		System.out.println("reversed queue:");
//		QueueReverser.reverse(queue);
//		for(Integer i:queue) {
//			System.out.println(i);
//		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the K element:");
		int k=sc.nextInt();
		System.out.println("reversing K elements:");
		QueueReverser.reverseQueueKelements(k, queue);
		for(Integer i:queue) {
			System.out.println(i);
		}
	}
}
