package dev.pratul;

public class ReverseString {

	public static void main(String[] args) {
		String string = "Harrah";
		boolean isPalindrom = true;
		if (string.length() <= 1) {
			System.out.println(isPalindrom);
		} else {
			int length = string.length();
			String lowerCase = string.toLowerCase();
			for (int i = 0; i < length; i++) {
				if (i <= length / 2) {
					if (lowerCase.charAt(i) == lowerCase.charAt(length - 1 - i)) {
						isPalindrom = true;
					} else {
						isPalindrom = false;
						break;
					}
				}
			}
		}

		System.out.println(isPalindrom);
	}

}
