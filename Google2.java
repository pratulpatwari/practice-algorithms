package dev.pratul;

import java.util.ArrayList;
import java.util.List;

public class Google2 {

	static int total = 0;

	public static void main(String... args) {
		List<Node2> BChild = new ArrayList<Node2>();
		BChild.add(new Node2(null, 2));
		BChild.add(new Node2(null, 3));
		BChild.add(new Node2(null, 1));
		Node2 B = new Node2(BChild, 5);

		List<Node2> AChild = new ArrayList<Node2>();
		AChild.add(new Node2(null, 2));
		AChild.add(B);
		Node2 A = new Node2(AChild, 0);
		total = findMaxCost(A);
		System.out.println(total);
	}

	private static int findMaxCost(Node2 root) {
		if (root.getChild() == null) {
			return total;
		} else {
			int maxCost = 0;
			Node2 child = null;
			for (Node2 children : root.getChild()) {
				if (maxCost < children.getIncomingCost()) {
					maxCost = children.getIncomingCost();
					child = children;
				}
			}
			total += maxCost;
			return findMaxCost(child);
		}

	}

}
