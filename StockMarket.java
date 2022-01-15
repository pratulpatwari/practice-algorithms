package dev.pratul;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {

	public static void predictAnswer() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stock = { 5, 6, 8, 4, 9, 10, 8, 3, 6, 4 };
		int[] quer = { 6, 5, 4 };
		List<Integer> stockData = new ArrayList<>();
		List<Integer> queries = new ArrayList<>();
		for (Integer i : stock) {
			stockData.add(i);
		}

		for (Integer i : quer) {
			queries.add(i);
		}

	}

}
