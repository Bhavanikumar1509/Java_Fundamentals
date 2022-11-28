package StackS;

import java.util.Stack;

//reversing the string using stack
class StringRev{
	public String reverse(String str) {
		String reverse="";
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		while(!stack.isEmpty())
			reverse+=stack.pop();
		return reverse;
		
	}
	
}

public class ReverseStringExample {
	public static void main(String[] args) {
		String str="abcd";
		StringRev reverser=new StringRev();
		System.out.println("Original String:"+str);
		System.out.println("reversed String:"+reverser.reverse(str));
		
	}

}
