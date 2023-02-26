package edu.wku.calculatecost;

public class CalculateCost {
    public static int calculateCost(double[] unitTotalPrices) {
        int sum = 0;
        for (double price : unitTotalPrices) sum += price;
        if (sum < 200) return sum;
        if (sum < 360) return (int) Math.floor(sum * 0.95);
        return sum >= 520 ? (int) Math.floor(sum * 0.8) : (int) Math.floor(sum * 0.9);
    }
}
