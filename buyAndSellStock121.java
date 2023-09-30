class Solution {
    public int maxProfit(int[] prices) {
        // Optimal solution.
        int mini = prices[0];
        int maxProfit = 0;
        for(int i = 1; i<prices.length;i++){
            mini = Math.min(mini,prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - mini);
        }
        return maxProfit;
    }
}