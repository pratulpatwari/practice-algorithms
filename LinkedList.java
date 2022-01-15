package dev.pratul;

import java.util.Random;

public class LinkedList {

	class Node {
		private Node next;
		private int data;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		public void setNext(Node node) {
			this.next = node;
		}

		public Node getNext() {
			return next;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
	}

	public Node addNode(Node head, int data) {
		Node node = new Node(data);
		Node current = head;
		if (head == null) {
			head = node;
		} else {
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
		}
		return head;
	}

	public void displayNodes(Node node) {
		while (node.getNext() != null) {
			System.out.print(node.getData() + ",");
			node = node.getNext();
		}
		System.out.print(node.getData());
	}

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		Node head = null;

		for (int i = 0; i < 50; i++) {
			Random random = new Random();
			int num = random.nextInt(100);
			System.out.print(num + ",");
			head = linkedList.addNode(head, num);
		}
		System.out.println();
		linkedList.displayNodes(head);
	}

}
