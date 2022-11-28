package Test;

public class Linkedlist {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			}
		}
	Node head;
	Node last;
	public void addLast(int data) {
		var node=new Node(data);
		if(isEmpty()) {
			head=last=node;
		}
		else {
			last.next=node;
			last=node;
		}
	}
	public void addFirst(int data) {
		var node=new Node(data);
		if(isEmpty()) {
			head=last=node;
		}
		else {
			node.next=head;
			head=node;
		}
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void traverse() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		Linkedlist l=new Linkedlist();
		l.addFirst(100);
		l.addFirst(150);
		l.addLast(02);
		l.addLast(03);
		l.traverse();
	}

}
