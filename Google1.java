package dev.pratul;

import java.util.HashMap;
import java.util.Map;

public class Google1 {


	static int total = 0;

	public static void main(String[] args) {

		Map<Node, Integer> BChild = new HashMap<Node, Integer>();
		BChild.put(new Node(null), 1);
		BChild.put(new Node(null), 3);
		BChild.put(new Node(null), 2);
		Node B = new Node(BChild);

		Map<Node, Integer> AChild = new HashMap<Node, Integer>();
		AChild.put(B, 5);
		AChild.put(new Node(null), 2);
		Node A = new Node(AChild);
		
		int total = findCostByMaxPath(A);
		System.out.println(total);
	}

	private static int findCostByMaxPath(Node node) {
		int maxValue = 0;
		Node child = null;
		if (node.getChildren() == null) {
			// this is the leaf node
			return total;
		} else {
			for (Map.Entry<Node, Integer> map : node.getChildren().entrySet()) {
				int value = map.getValue();
				if (maxValue < value) {
					maxValue = value;
					child = map.getKey();
				}
			}
			total += maxValue;
			return findCostByMaxPath(child);
		}
	}
}
