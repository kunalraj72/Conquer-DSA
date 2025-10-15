// Last updated: 16/10/2025, 04:29:15
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < n; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i]; //Buy at lower price
            }else{
                maxProfit = Math.max(maxProfit, prices[i] - minPrice); //sell at higher price
            }
        }
        return maxProfit;
    }
}
