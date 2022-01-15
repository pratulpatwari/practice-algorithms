package dev.pratul;

import java.util.HashMap;
import java.util.Map;

public class Node {

	Map<Node, Integer> child = new HashMap<Node, Integer>();

	public Node(Map<Node, Integer> child) {
		this.child = child;
	}

	public Map<Node, Integer> getChildren() {
		return child;
	}

	public void setChildren(Map<Node, Integer> children) {
		this.child = children;
	}
}
