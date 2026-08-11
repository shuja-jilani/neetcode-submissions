class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for(int i = 1; i< prices.length; i++){
            min = Math.min(min,prices[i]);
            int tempProfit = prices[i]-min;
            profit = Math.max(profit, tempProfit);
        }
        return profit;
    }
}
