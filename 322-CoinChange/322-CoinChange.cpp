// Last updated: 16/10/2025, 04:27:16
class Solution {
public:
    // int helper(int index, vector<int> coins, int target, vector<vector<int>> &dp){
    //     //Base Case
    //     if( target == 0 ) return 0; 
    //     if(index==0)
    //     {
    //         if((target%coins[0])==0) return target/coins[0];
    //         return 1e8;
    //     }
    //     if(dp[index][target]!=-1) 
    //         return dp[index][target];
    //     int notTake= 0 +  helper(index-1,coins,target,dp);
    //     int take=1e8;
    //     if(target>=coins[index])
    //         take= 1 + helper(index,coins,target-coins[index],dp);
    //     return dp[index][target]=min(take,notTake);
    // }
    
    int coinChange(vector<int>& arr, int T)
    {
    
    int n= arr.size();
    vector<vector<int>> dp(n,vector<int>(T+1,0));
    
    for(int i=0; i<=T; i++){
        if(i%arr[0] == 0)  
            dp[0][i] = i/arr[0];
        else dp[0][i] = 1e9;
    }
    
    for(int ind = 1; ind<n; ind++){
        for(int target = 0; target<=T; target++){
            
            int notTake = 0 + dp[ind-1][target];
            int take = 1e9;
            if(arr[ind]<=target)
                take = 1 + dp[ind][target - arr[ind]];
                
             dp[ind][target] = min(notTake, take);
        }
    }
    
    int ans = dp[n-1][T];
    if(ans >=1e9) return -1;
    return ans;
    }
};