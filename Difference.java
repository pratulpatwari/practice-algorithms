package dev.pratul;

import java.util.Arrays;
import java.util.Random;

public class Difference {

	private int[] elements;
	public int maximumDifference;
	public int maximumDifferenceSorted;

	public Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {
		int maximum = elements[0];
		int minimum = elements[0];
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] <= minimum) {
				minimum = elements[i];
			}
			if (elements[i] > maximum) {
				maximum = elements[i];
			}
		}
		maximumDifference = maximum - minimum;
	}

	public void computeDifferenceSorted() {
		Arrays.sort(elements);
		maximumDifferenceSorted = elements[elements.length - 1] - elements[0];
	}

	public static void main(String[] args) {
		int[] a = new int[100];
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			a[i] = random.nextInt(100);
		}
		Difference difference = new Difference(a);
		long starting = System.nanoTime();
		difference.computeDifference();
		long ending = System.nanoTime();
		System.out.println(ending - starting);
		System.out.println("Maximum Difference: " + difference.maximumDifference);

		long startingSorted = System.nanoTime();
		difference.computeDifferenceSorted();
		long endingSorted = System.nanoTime();
		System.out.println(endingSorted - startingSorted);
		System.out.println("Maximum Difference Sorted: " + difference.maximumDifferenceSorted);
	}

}
