package dev.pratul;

public class Hacker2 {

	static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        double total = meal_cost + tip + tax;
        int totalCost = (int) Math.round(total);
        System.out.println(totalCost);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(12.0, 20, 8);
	}

}
