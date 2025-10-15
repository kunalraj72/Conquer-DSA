// Last updated: 16/10/2025, 04:29:20
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=0; i<n; i++){
            int profit = prices[i] - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
            minPrice = min(minPrice,prices[i]);
        }
        return maxProfit;
    }
};