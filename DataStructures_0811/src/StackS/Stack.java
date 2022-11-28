package StackS;


public class Stack {
	private int[] items=new int[5];
	private int count;
	//push
	public void push(int item) {
		if(count==items.length)
			throw new StackOverflowError();
		items[count++]=item;
	}
	
	//pop
	public int pop() {
		if(count==0)
			throw new IllegalStateException();
		return items[--count];
	}
	//peek of  the stack
	public int peek() {
		return items[count-1];
		
	}
	
	//is empty
	public boolean isEmpyt() {
		return count==0;
	}
	public int Min() {
		int minimum=items[0];
		for(int i=0;i<count;i++) {
			if(items[i]<minimum) {
				minimum=items[i];
			}
		}
		return minimum;
	}
	
	//traverse
	public void display() {
		if(count==0) {
			System.out.println("staack is empty");
		}
		for(int i=0;i<count;i++) {
			System.out.println(items[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("_____________Stack1_________________");
		Stack stk=new Stack();
		stk.push(190);
		stk.push(200);
		stk.push(120);
		stk.push(150);
		stk.push(180);
		System.out.println("Elements in the stack:");
		stk.display();
		System.out.println("Minimum element in the stack:"+stk.Min());
		System.out.println("pop out of  stack:"+stk.pop());
		System.out.println("peek in the stack:"+stk.peek());
		System.out.println("Is EMpty:"+stk.isEmpyt());
		System.out.println("Minimum element in the stack:"+stk.Min());
		
		System.out.println("_____________Stack2_________________");
		Stack stk2=new Stack();
		stk2.push(690);
		stk2.push(740);
		stk2.push(160);
		stk2.push(820);
		stk2.push(180);
		System.out.println("Elements in the stack2:");
		stk2.display();
		System.out.println("pop out of  stack:"+stk2.pop());
		System.out.println("peek in the stack:"+stk2.peek());
		System.out.println("Is EMpty:"+stk2.isEmpyt());
		System.out.println("Minimum element in the stack:"+stk2.Min());
		

		
		
	}
}
