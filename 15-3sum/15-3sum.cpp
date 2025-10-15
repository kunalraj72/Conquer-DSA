// Last updated: 16/10/2025, 04:31:38
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int n = nums.size();
        set<vector<int>> s;
        sort(nums.begin(),nums.end());
        
        for(int i=0;i<n-2;i++){
            int j = i+1;
            int k = n-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0 && i!=j && j!=k && i!=k){
                    s.insert({nums[i],nums[j],nums[k]});
                    j++;
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        
        vector<vector<int>> ans;
        for(auto it : s){
            ans.push_back(it);
        }
        
        return ans;
    }
};