package dev.pratul;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HourGlass {

	private static void findHourGlass(int[][] arr) {

		List<int[][]> list = new LinkedList<>();

		for (int i = 0; i <= arr.length / 2; i++) {
			
			for (int row = i; row < arr.length / 2 + i; row++) {
				
				for (int k = 0; k <= arr.length / 2; k++) {
					
					
					for (int column = k; column < arr.length / 2 + k; column++) {
						System.out.print("[" + row + "" + column + "]"+ arr[row][column] + " ");
					}
					
					System.out.print("            ");
					
				}

				System.out.println();

			}
			
			System.out.println();
			System.out.println();
			System.out.println();
		}

		for (int[][] element : list) {
			for (int row = 0; row < element.length; row++) {
				for (int column = 0; column < element.length; column++) {
					System.out.print(element[row][column] + " ");
				}
			}
			System.out.println();
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}
		findHourGlass(arr);

	}

}
