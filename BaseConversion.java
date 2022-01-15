package dev.pratul;

import java.util.LinkedList;
import java.util.List;

public class BaseConversion {

	static List<Integer> list = new LinkedList<Integer>();

	private static void convertBases(int n) {
		if (n >= 1) {
			int remainder = n % 2;
			int quotient = n / 2;
			if (quotient >= 1) {
				list.add(remainder);
				convertBases(quotient);
			} else {
				list.add(remainder);
			}
		}
	}

	private static int consecutiveOnes(List<Integer> list) {
		int counter = 0;
		int tmp = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 1) {
				counter += 1;
			} else {
				if ((tmp == 0 && counter != 0) || (tmp != 0 && counter != 0 && tmp < counter)) {
					tmp = counter;
				}
				counter = 0;
			}
		}
		if (tmp < counter) {
			System.out.println(counter);
		} else {
			System.out.println(tmp);
		}
		return counter;
	}

	public static void main(String[] args) {
		convertBases(44321);
		consecutiveOnes(list);
	}

}
