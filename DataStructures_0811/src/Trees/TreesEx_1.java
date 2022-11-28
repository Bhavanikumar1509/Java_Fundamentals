package Trees;

import java.util.LinkedList;

// Build a Tree
// Create Certain Nodes 
// Insert
// Find
// Traversal

class Tree {
	private class Node {
		private int value;
		private Node leftChild;
		private Node rightChild;

		public Node(int value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Node=" + value;
		}
	}

	private Node root;

	public void insert(int value) {

		var node = new Node(value);

		if (root == null) {
			root = node;
			return;
		}

		var current = root;
		while (true) {
			if (value < current.value) {
				if (current.leftChild == null) {
					current.leftChild = node;
					break;
				}
				current = current.leftChild;
			} else {
				if (current.rightChild == null) {
					current.rightChild = node;
					break;
				}
				current = current.rightChild;
			}
		}
	}

	public boolean find(int value) {
		var current = root;
		while (current != null) {
			if (value < current.value)
				current = current.leftChild;
			else if (value > current.value)
				current = current.rightChild;
			else
				return true;
		}
		return false;
	}

	public void traversePreOrder() {
		traversePreOrder(root);
	}

	private void traversePreOrder(Node root) {
		if (root == null)
			return;

		System.out.println(root.value);
		traversePreOrder(root.leftChild);
		traversePreOrder(root.rightChild);
	}
	//Traverse PostOrder
	public void traversePostOrder() {
		traversePostOrder(root);
	}
	private void traversePostOrder(Node root) {
		if(root==null)
			return;
		traversePostOrder(root.leftChild);
		traversePostOrder(root.rightChild);
		System.out.println(root.value);
		
	}
	//Traverse InOrder
	public void traverseInOrder() {
		traverseInOrder(root);
	}
	private void traverseInOrder(Node root) {
		if(root==null)
			return;
		traverseInOrder(root.leftChild);
		System.out.println(root.value);
		traverseInOrder(root.rightChild);
		
		
	}
	//Traverse LevelOrder
	public void traverseLevelOrder() {
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node node = queue.removeFirst();
			System.out.print(node.value + " ");
			if (node.leftChild != null)
				queue.add(node.leftChild);
			if (node.rightChild != null)
				queue.add(node.rightChild);
		}
	}
	//remove element 
	public void deleteNode(int k) {
		deleteNode(root,k);
	}
	private Node deleteNode(Node root,int k)
	{
	    if (root == null)
	        return root;
	    if (root.value > k) 
	    {
	        root.leftChild = deleteNode(root.leftChild, k);
	        return root;
	    }
	    else if (root.value < k) 
	    {
	        root.rightChild = deleteNode(root.rightChild, k);
	        return root;
	    }
	    if (root.leftChild == null) 
	    {
	        Node temp = root.rightChild;
	        return temp;
	    }
	    else if (root.rightChild == null) 
	    {
	        Node temp = root.leftChild;
	        return temp;
	    }
	    else 
	    {
	        Node succParent = root;
	        Node succ = root.rightChild;
	          
	        while (succ.leftChild != null) 
	        {
	            succParent = succ;
	            succ = succ.leftChild;
	        }
	        if (succParent != root)
	            succParent.leftChild = succ.rightChild;
	        else
	            succParent.rightChild = succ.rightChild;
	        root.value = succ.value;
	  
	        return root;
	        
	    }  
	}
	
	//level order
	public void levelorder() {
		levelorder(root);
	}
	private void levelorder(Node root) {
		int h=height(root);
		int i;
		for(i=1;i<=h;i++) {
			Pcurr(root,i);
		}
	}
	public void Pcurr(Node root,int level){
	    if(root==null){
	        return;
	    }
	    if(level ==1){
	        System.out.println(root.value);
	    }
	    else if(level>1){
	        Pcurr(root.leftChild,level-1);
	        Pcurr(root.rightChild,level-1);
	    }
	}
	public int height (Node root) {
		if(root==null) {
			return 0;
		}
		else {
			int lheight=height(root.leftChild);
			int rheight=height(root.rightChild);
			if(lheight>rheight){
	            return (lheight+1);
	        }
	        else{
	            return(rheight+1);
	        }
		}
	}

}

public class TreesEx_1 {

	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.insert(7);
		tree.insert(4);
		tree.insert(1);
		tree.insert(6);
		tree.insert(9);
		tree.insert(8);
		tree.insert(10);
		System.out.println("____find element______");
		System.out.println(tree.find(1));
		
		System.out.println("_______Pre order__________");
		tree.traversePreOrder();
		System.out.println("_______Post order__________");
		tree.traversePostOrder();
		System.out.println("_______In order__________");
		tree.traverseInOrder();
		System.out.println("_______Level order__________");
		tree.traverseLevelOrder();
		System.out.println("\n_____removal element___");
		tree.deleteNode(9);
		System.out.println("ELement is removed");
		System.out.println("_______Level order__________");
		tree.levelorder();
		
		
		

	}

}