// Last updated: 16/10/2025, 04:27:03
class Solution {
public:
    bool helper(int ind, int target, vector<int> &arr, vector<vector<int>> &dp){
    if(target == 0){
        return true;
    }
    if(ind == 0){
        return (arr[0] == target);
    }
    
    if(dp[ind][target] != -1){
        return dp[ind][target];
    }
    bool notTake = helper(ind-1,target,arr,dp);
    bool take = false;
    if(target >= arr[ind]){
        take = helper(ind-1,target-arr[ind],arr,dp);
    }
    
    
    dp[ind][target] = take || notTake;
    return dp[ind][target];
    
}

    bool canPartition(vector<int>arr){
        int N= arr.size();
        int sum = 0;
        for(int i=0; i<N;i++){
            sum += arr[i];
        }
        if(sum%2 == 1){
            return false;
        }
        int target = sum/=2;
        vector<vector<int>> dp(N,vector<int>(target+1,-1));
        
        //Note: we are creation 2d dp array with no. of column = sum+1
       //because 0 se lekar sum tak me koi bhi state ho sakta hai so 0 ka ek extra +1.
       //Agar ab bhi nahi samajh aaya toh ek baari copy me recursive tree wala examole dekh
       //lena.
       // boolean t[][]=new boolean[N][sum+1];
       
       if(helper(N-1,target,arr,dp)){
           return 1;
       }
       return 0;
    }
   
};