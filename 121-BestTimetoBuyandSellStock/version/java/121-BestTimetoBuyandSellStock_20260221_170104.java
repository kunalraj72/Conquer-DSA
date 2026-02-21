// Last updated: 21/02/2026, 17:01:04
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int minPrice = Integer.MAX_VALUE;
5        int maxProfit = 0;
6
7        for(int i = 0; i < n; i++){
8            if(prices[i] < minPrice){
9                minPrice = prices[i]; //Buy at lower price
10            }else{
11                maxProfit = Math.max(maxProfit, prices[i] - minPrice); //sell at higher price
12            }
13        }
14        return maxProfit;
15    }
16}
17