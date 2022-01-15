package dev.pratul;

import java.util.Arrays;

public class StringSplosion {

	private static String stringSplosion(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result += str.substring(0, i + 1);
		}
		return result;
	}

	private static void arrays(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] >= 0) {
					
				}
				if(arr[j] < 0) {
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String... args) {
		System.out.println(stringSplosion("Code"));
		arrays(new int[] { -4, 8, 6, -5, 6, -2, 1, 2, 3, -11 }, 6);
	}
}
