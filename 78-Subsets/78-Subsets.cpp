// Last updated: 16/10/2025, 04:30:02
#include<vector>
class Solution {
    
public:
    vector<vector<int>> ans;
    void  helper(int ind, vector<int> &ds, vector<int> &nums, int n){
        if(ind == n){
            ans.push_back(ds);
            return;
        }
        ds.push_back(nums[ind]);
        helper(ind+1,ds,nums,n);
        ds.pop_back();
        helper(ind+1,ds,nums,n);
    }
    
    vector<vector<int>> subsets(vector<int>& nums) {
        int n = nums.size();
        vector<int> ds;
        helper(0,ds,nums,n);
        return ans;
    }
};