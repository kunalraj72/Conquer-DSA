// Last updated: 16/10/2025, 04:30:37
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        //Kadanes Algo
        int sum = 0;
        int maxSum = INT_MIN;
        for(auto it : nums){
            sum += it;
            maxSum = max(maxSum,sum);
            if(sum < 0){
                sum = 0;
            }
           
        }
        return maxSum;
    }
};