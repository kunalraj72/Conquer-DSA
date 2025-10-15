// Last updated: 16/10/2025, 04:29:07
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ans = 0;
        for(int i=0;i<nums.size();i++){
            ans ^= nums[i];
        }
        return ans;
    }
};