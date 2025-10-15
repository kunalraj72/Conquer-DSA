// Last updated: 16/10/2025, 04:29:51
class Solution {
public:
    
    
     void  helper(int ind, vector<int> &arr, vector<int> ds, vector<vector<int>> &ans){
        ans.push_back(ds);
        for(int i=ind;i<arr.size();i++){
            if(i != ind && arr[i] == arr[i-1]) continue;
                ds.push_back(arr[i]);
                helper(i+1,arr,ds,ans);
                ds.pop_back();
            
        }
    }
  
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<vector<int>>ans;
        vector<int>ds;
        sort(nums.begin(),nums.end());
        helper(0,nums,ds,ans);
        
        return ans;
    }
};