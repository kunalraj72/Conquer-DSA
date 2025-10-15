// Last updated: 16/10/2025, 04:28:04
class Solution {
public:
    
    int maximumNonAdjacentSum(vector<int> &nums){
     int n = nums.size();
    
    //Space Optimization
        int  prev = nums[0];
        int  prev2 = 0;
      for(int i=0;i<n;i++){
        int  pick = nums[i];
        if(i>1) pick += prev2;
        int nonPick = prev;
        int curi = max(pick,nonPick);
        prev2 = prev;
        prev = curi;
    }
    return prev;
} 
    
    int rob(vector<int>& nums) {
        int n = nums.size();
        if(n == 1) return nums[0];
        vector<int> temp1,temp2;
         for(int i=0;i<n;i++){
             if(i!=0) temp1.push_back(nums[i]);
             if(i!=n-1) temp2.push_back(nums[i]);
         }
        return max(maximumNonAdjacentSum(temp1),maximumNonAdjacentSum(temp2));
    }
};