package LinkedLists;

import java.util.Scanner;

public class UserDefined_LinkedList {
	Scanner sc=new Scanner(System.in);
	class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	private Node first;
	private Node last;
	public void addList(int item) {
		var node=new Node(item);
		if(isEmpty()) {
			first=last=node;
			
		}
		else {
				last.next=node;
				last=node;
			}
		}
		public void addFirst(int item) {
			var node=new Node(item);
			if(isEmpty()) {
				first=last=node;
			}
			else {
				node.next=first;
				first=node;
			}
			
		}
		//indexOF()
		public int IndexOf(int item) {
			int c=0;
			int res=0;
			Node temp=first;
			while(temp!=null) {
				if(temp.data==item) {
					res=c;
					
				}
				temp=temp.next;
				c++;	
			}
			return res;
		}
		
		//size()
		public int size() {
			int size=0;
			Node temp=first;
			while(temp!=null) {
				size+=1;
				temp=temp.next;
				
			}
			return size;
		}
		//contains()
		public void contains(int item) {
			Node temp=first;
			int c=0;
			while(temp!=null) {
				if(temp.data==item) {
					c+=1;
					break;
				}
				temp=temp.next;
			}
			if(c>=1) {
				System.out.println(" Element FOund");
			}
			else {
				System.out.println("No found");
			}
		}
		
		//convertToArray()
		public int[] convertArray() {
			int[] array=new int[10];
			var current=first;
			var index=0;
			while(current!=null) {
				array[index++]=current.data;
				current=current.next;
			}
			return array;
		}
		
		//isEMptytempy
	public boolean isEmpty() {
		
		return first==null;
		
	}
	//Middle of the Element
	public void PrintMiddle() {
			int s=size();
			int c=0;
			int mid=s/2;
			if(s%2!=0) {
				Node temp=first;
				while(temp!=null) {
					if(c==mid) {
						System.out.println("Midddle of the Linked list:"+temp.data);
					}
					temp=temp.next;
					c++;
					
				}
			}
			else {
				
				Node temp=first;
				while(temp!=null) {
					if(c==mid-1 || c==mid) {
						System.out.println("Middle elements are:"+temp.data);
					}
					temp=temp.next;
					c++;
			}
			}
			
		
	}
	
	
	
	
	//traversal
	public void display() {
		Node temp=first;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
			
		}
		
	}
	public static void main(String[] args) {
		UserDefined_LinkedList l=new UserDefined_LinkedList();
		l.addList(100);
		l.addList(200);
		l.addFirst(160);
		l.addFirst(600);
		l.display();
		l.contains(200);
		l.convertArray();
		System.out.println("size of the linked list:"+l.size());
		System.out.println("Found at Index:"+l.IndexOf(200));
		l.PrintMiddle();
	}
	
}
