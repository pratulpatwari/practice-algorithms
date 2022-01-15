package dev.pratul;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public boolean solution1(String S) {
		String[] ab = S.split("b");
		if (ab.length > 1) {
			return false;
		} else {
			return true;
		}
	}

	// "abc1hdj8894f9-45hj"
	static void stringToMap(String str) {
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				System.out.println(str.substring(0, i));
				System.out.println(str.substring(i, str.length() - 1));
				break;
			}
		}
	}

	static List<String> splitString(String str) {
		StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
			} else if (Character.isAlphabetic(str.charAt(i))) {
				alpha.append(str.charAt(i));

			} else
				special.append(str.charAt(i));
		}

		list.add(alpha.toString());
		list.add(num.toString());
		list.add(special.toString());
		return list;
	}

	public boolean solution(String[] input) {
		// write your code in Java SE 8
		for (int i = 0; i < input.length; i++) {
			stringToMap(input[i]);
			for (int j = i + 1; j < input.length; j++) {
				if (input[i].length() <= input[j].length()) {
					List<String> str1 = splitString(input[i]);
					List<String> str2 = splitString(input[j]);
					int stringResult = str1.get(0).compareTo(str2.get(0));
					int numberResult = str1.get(1).compareTo(str2.get(1));
					if (stringResult <= 0 && numberResult <= 0) {
						// value is lesser and in sorter order
					}
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String... args) {
		String[] input = { "abc1hdj8894f9-45hj", "abc954hdj8894f9-45hj", "abc01234hdj894f9-45hj",
				"abc1234hdj8894f9-45hj", "abc1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj",
				"xyz1234hdj8894f9-45hj" };
		Solution sol = new Solution();
		System.out.println(sol.solution(input));

	}

}
