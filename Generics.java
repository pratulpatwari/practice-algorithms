package dev.pratul;

public class Generics {

	private static <T extends Comparable<T>> T findMax(T a, T b) {
		int result = a.compareTo(b);
		if(result < 0) {
			return b;
		} else if(result == 0) {
			return a;
		} else {
			return a;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findMax(19,3));
		
		System.out.println(findMax("Pratul", "PraTul"));
	}

}
