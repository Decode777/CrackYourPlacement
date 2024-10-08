
class Solution {
    public int maxProfit(int[] prices) {
        int cp = prices[0];
        int profit = 0;
//cp-prices[i] 

for (int i = 1; i < prices.length; i++) {
    if (prices[i] < cp) {
        cp = prices[i];
    }
    profit = Math.max(profit, prices[i] - cp);
}

return profit;        
    }
}