// Last updated: 16/10/2025, 04:25:34
class Solution {
public:
    
    int ans(int n, vector<int> &dp){
        if(n<=1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = ans(n-1,dp) + ans(n-2,dp);
        return dp[n];
    }
    int fib(int n) {
        vector<int> dp(n+1,-1);
        return ans(n,dp);
    }
};