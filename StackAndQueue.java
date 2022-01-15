package dev.pratul;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class StackAndQueue {

	Stack<Character> stack = new Stack<>();

	Queue<Character> queue = new LinkedList<>();

	void pushCharacter(char ch) {
		stack.push(ch);
	}

	void enqueueCharacter(char ch) {
		queue.add(ch);
	}

	char popCharacter() {
		return stack.pop();
	}

	char dequeueCharacter() {
		return queue.remove();
	}

	public static void main(String[] args) {
		String s = "racecar";
		StackAndQueue stackQueue = new StackAndQueue();
		for (char c : s.toCharArray()) {
			stackQueue.pushCharacter(c);
			stackQueue.enqueueCharacter(c);
		}

		boolean isPalindrom = true;

		for (int i = 0; i < s.toCharArray().length; i++) {
			if (stackQueue.popCharacter() == stackQueue.dequeueCharacter()) {
				isPalindrom = true;
			} else {
				isPalindrom = false;
				break;
			}
		}
		System.out.println(isPalindrom);
	}

}
