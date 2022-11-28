package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Graph{
	private class Node{
		private String label;
		public Node(String label) {
			this.label = label;
		}
		@Override
		public String toString() {
			return label;
		}
	}
	private Map<String,Node> nodes = new HashMap<>();
	private Map<Node, List<Node>> adjacencyList = new HashMap<>();
	
	public void addNode(String label) {
		var node = new Node(label);
		nodes.putIfAbsent(label, node);
		adjacencyList.putIfAbsent(node, new ArrayList<>());
	}
	public void addEdge(String from, String to) {
		var fromNode = nodes.get(from);
		if(fromNode==null)
			throw new IllegalArgumentException();
		var toNode = nodes.get(to);
		if(toNode==null)
			throw new IllegalArgumentException();
		adjacencyList.get(fromNode).add(toNode);
	}
	//remove Edge
	public void removeEdge(String from,String to) {
		var fromNode=nodes.get(from);
		if(fromNode==null)
			throw new IllegalArgumentException();
		var toNode=nodes.get(to);
		if(toNode==null)
			throw new IllegalArgumentException();
		adjacencyList.get(fromNode).remove(toNode);
		
	}
	//remove Node
	public void removeNode(String label) {
		 var node = nodes.get(label);
	        if (node == null)
	            return;

	        for (var source : adjacencyList.keySet())
	        	adjacencyList.get(source).remove(node);

	        adjacencyList.remove(node);
	        nodes.remove(label);
		
	}
		
	public void print() {
		for(var source: adjacencyList.keySet()) {
			var targets = adjacencyList.get(source);
			if(!targets.isEmpty())
				System.out.println(source + " is connected to "+targets);
		}
	}
}
public class GrpahExample {

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addNode("A");
		graph.addNode("B");
		graph.addNode("C");
		graph.addNode("D");
		graph.addNode("E");
		graph.addEdge("A","B");
		graph.addEdge("A","C");
		graph.addEdge("B","C");
		graph.addEdge("E","D");
		graph.addEdge("C","D");
		System.out.println("_____AFter Adding Edges_____");
		graph.print();
		graph.removeEdge("C", "D");
		System.out.println("_____AFter Removing the Edges_____");
		graph.print();
		
		System.out.println("____After removing Node____");
		graph.removeNode("E");
		graph.print();
	}

}