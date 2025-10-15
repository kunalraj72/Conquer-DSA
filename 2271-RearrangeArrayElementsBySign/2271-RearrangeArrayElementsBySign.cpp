// Last updated: 16/10/2025, 04:24:36
class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int n = nums.size();
        int oIndex = 1;
        int eIndex = 0;
        vector<int> ans(n);
        for(int i=0;i<n;i++){
            if(nums[i] >= 0){
                ans[eIndex] = nums[i];
                eIndex += 2;
            }
            else{
                ans[oIndex] = nums[i];
                oIndex += 2;
            }
        }
        return ans;
    }
};