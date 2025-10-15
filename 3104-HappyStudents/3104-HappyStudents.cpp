// Last updated: 16/10/2025, 04:23:43
class Solution {
public:
    int countWays(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int ways = 0;
        int n = nums.size();
        
        for(int i=0;i<n;i++){
            if((nums[i] < (i+1)) && (i+1) < n && (nums[i+1] > i+1)){
                ways++;
            }
               else if(nums[i] < (i+1) && i+1 == n){
                   ways++;
               }
        }
        if(nums[0] > 0) ways++;
        
        return ways;
    }
};

