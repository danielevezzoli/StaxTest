package it.unibs.ing.ieee.staxtest;

import java.util.Vector;

public class Node {
	String ID;
	String label;
	boolean start=false,end=false;
	Vector<Node> linked_nodes = new Vector<>();
	Vector<String> weights = new Vector<>();
	
	
	public void setID(String data) {
		// TODO Auto-generated method stub
		ID = data;
	}


	public void setLabel(String data) {
		// TODO Auto-generated method stub
		label = data;
	}


	public String getID() {
		// TODO Auto-generated method stub
		return ID;
	}


	public void setStart(boolean start) {
		this.start = start;
	}


	public void setEnd(boolean end) {
		this.end = end;
	}


	public void addLinkedNode(Node nodeByID, String weight) {
		linked_nodes.add(nodeByID);
		weights.add(weight);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("Node " + label + "\n");
		for (Node node : linked_nodes) {
			int i = linked_nodes.indexOf(node);
			str.append(node.getID() + " - Peso: " + weights.get(i) + "\n");
		}
		
		return str.toString();
	}
	
}
