class Solution {
    // 2 pointer solution
    // public int maxProfit(int[] prices) {
    //     int maxProfit = 0;
    //     int profit = 0;
    //     for(int i = 0; i < prices.length; i ++){
    //         int L = i, R = prices.length - 1;
    //         while (L < R) {
    //             profit = prices[R] - prices[L];
    //             maxProfit = Math.max(maxProfit, profit);
    //             R--;
    //         }
    //     }
    //     return maxProfit;
    // }

    // min value to buy
    // max value to sell
    // min value - current price > 0 -> update min = current price 
    public int maxProfit(int[] prices) {
        int L = 0, R = 1;
        int maxProfit = 0;
        while(R < prices.length){
            // have profit
            if(prices[L] < prices[R]){
                //calculate profit and update max
                maxProfit = Math.max(prices[R] - prices[L], maxProfit);
            }
            else{
                //find a more good price to buy 
                //update buy to sell price
                L = R;
            }
            R++;
        }
        return maxProfit;
    }
}
