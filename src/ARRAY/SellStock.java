package ARRAY;
public class SellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println(result);  // Output: 5
    }

    public static int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        // Iterate over the prices array using a traditional for loop
        for (int i = 0; i < prices.length; i++) {
            // Update min_price if current price is lower
            if (prices[i] < min_price) {
                min_price = prices[i];
            }
            // Calculate profit if we sold at current price
            int profit = prices[i] - min_price;

            // Update max_profit if this profit is higher
            if (profit > max_profit) {
                max_profit = profit;
            }
        }

        return max_profit;
    }
}


