package dev.pratul;

import java.util.List;

public class Node2 {

	private List<Node2> child;
	private int incomingCost;

	Node2(List<Node2> child, int cost) {
		this.child = child;
		this.incomingCost = cost;
	}

	public List<Node2> getChild() {
		return child;
	}

	public int getIncomingCost() {
		return incomingCost;
	}

}
