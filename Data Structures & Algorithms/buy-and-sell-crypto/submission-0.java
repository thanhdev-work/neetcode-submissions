class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;
        for(int i = 0; i < prices.length; i ++){
            int L = i, R = prices.length - 1;
            while (L < R) {
                profit = prices[R] - prices[L];
                maxProfit = Math.max(maxProfit, profit);
                R--;
            }
        }
        return maxProfit;
    }
}
