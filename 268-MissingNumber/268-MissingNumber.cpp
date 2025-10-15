// Last updated: 16/10/2025, 04:27:34
class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        int reqSum = n*(n+1)/2;
        int actualSum = 0;
        for(int i=0;i<n;i++){
            actualSum += nums[i];
        }
        int missing_number = reqSum - actualSum;
        
        return missing_number;
    }
};