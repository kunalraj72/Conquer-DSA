// Last updated: 16/10/2025, 04:26:39
class Solution {
public:
    long long int solve(vector<int> coins,  int index, int balance, vector<vector<int>> &dp){
    // Base Case
        if( balance == 0 ) return 1; //only notTake option.
        if(index==0)
        {
            return (balance%coins[0] == 0);
        }
        if(dp[index][balance] != -1){
            return dp[index][balance];
        }
        // Take;
        long long int  take=0;
        if(coins[index] <= balance){
            //ans.push_back(coins[index]);
            take = solve(coins, index, balance-coins[index],dp);
        }
        
        // Non take
          long long int notTake = solve(coins, index-1, balance,dp); 
    
        return dp[index][balance] = (take + notTake);
     }
    
    int change(int T, vector<int>& coins) {
        int N = coins.size();
        vector<vector<int>> dp(N,vector<int>(T+1,-1));
        return solve(coins,N-1,T,dp);  
    }
};