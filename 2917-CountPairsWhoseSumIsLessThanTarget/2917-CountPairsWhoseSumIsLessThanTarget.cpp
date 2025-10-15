// Last updated: 16/10/2025, 04:23:55
class Solution {
public:
    int countPairs(vector<int>& nums, int target) {
        int n = nums.size();
        sort(nums.begin(),nums.end());
        int l = 0, r = n-1;
        int cnt = 0;
        while(l < r){
            if(nums[l] + nums[r] < target){
                cnt += r-l;
                l++;
            }
            else if(nums[l] + nums[r] >= target){
                r--;
            }
        }
        return cnt;
    }
};