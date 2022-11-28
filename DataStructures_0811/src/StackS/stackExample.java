package StackS;

import java.util.Stack;

/**
 * LIFO--last in first order.....first in last out
 * stack: implements iterable,collection,list
 * stack extends vector class
 * used in:
 * implementation of undo
 * syntax checking
 * evaulate expressions
 * build navigation
 * 
 * operations
 * push-->Add item to the stack(to the top)
 * pop-->remove item from the stack  (from the top)
 * peek-->returns the item which is ready to pop
 * is empty--checks is empty or not
 * 
 * **/

public class stackExample {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println("Is Empty:"+stack.isEmpty());
		stack.push(732);
		stack.push(614);
		stack.push(314);
		stack.push(264);
		for(Integer i:stack) {
			System.out.println(i);
		}
		System.out.println("popped():"+stack.pop());
		System.out.println("peeks(ready to pop:"+stack.peek());
		
		
	}

}
