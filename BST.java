package dev.pratul;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class BST {

	List<Node> nodes = new LinkedList<Node>();

	class Node {
		private int value;
		private Node left;
		private Node right;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}
	}

	public static void main(String[] args) {
		
		int[] numbers = {8,6,10,3,4,1,7,13,14};
		
		Arrays.sort(numbers);
		
	}

}
