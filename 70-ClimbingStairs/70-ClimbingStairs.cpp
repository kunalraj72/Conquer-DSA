// Last updated: 16/10/2025, 04:30:11
class Solution {
public:
//     int solve(int ind, vector<int> &dp){
//         if(ind == 0) return 1;
//         if(ind == 1) return 1;
        
//         return dp[ind] = solve(ind-1,dp) + solve(ind-2,dp);
//     }
    
    int climbStairs(int n) {
        vector<int> dp(n+1,-1);
        dp[0] = 1;  
        dp[1] = 1;
        int i;
        for(i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[i-1];
        
        //return solve(n,dp);
    }
};