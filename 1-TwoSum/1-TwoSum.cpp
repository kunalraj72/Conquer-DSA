// Last updated: 16/10/2025, 04:31:59
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n = nums.size();
        unordered_map<int,int> mp;
        int sum = 0;
        for(int i=0;i<n;i++){
            int b = target - nums[i];
            if(mp.find(b) != mp.end()){
                return {i,mp[b]};
            }
            mp[nums[i]] = i;
            
        }
        return {-1,-1};
    }
};
    
    
            

        