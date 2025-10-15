// Last updated: 16/10/2025, 04:25:37
class Solution {
public:

    //Video: https://www.youtube.com/watch?v=95_sni02RqA
    //Doc: https://leetcode.com/problems/binary-subarrays-with-sum/discuss/2571145/C%2B%2B-Sliding-Window-or-Prefix-Sum-or-Hashing-solution-or-O(N)
    int atMost(vector<int> &nums, int target){
        if(target< 0){ // To handle Goal = 0 case and nums = [0 0 0 0]
            return 0;
        }
       int s = 0, e =0;
       int n = nums.size();
       int sum = 0;
       int count = 0;
        while(e<n){
               sum += nums[e];
            if(sum > target){
                while(sum > target){
                    sum -= nums[s];
                    s++;
                }
            }
            count += e-s+1;
            e++;
      }
        return count;
    }
    
    int numSubarraysWithSum(vector<int>& nums, int goal) {
        
        return atMost(nums,goal) - atMost(nums,goal-1);
        
    }
};