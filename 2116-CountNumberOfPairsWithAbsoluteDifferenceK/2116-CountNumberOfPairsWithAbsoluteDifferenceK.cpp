// Last updated: 16/10/2025, 04:24:42
class Solution {
public:
    int countKDifference(vector<int>& nums, int k) {
        unordered_map<int,pair<int,int>> mp;
        int n= nums.size();
        int count = 0;
        
        for(int i =0;i<n;i++){
            int diff1 = nums[i]-k;
            int diff2 = nums[i]+k;
            if(mp.find(diff1) != mp.end() && i>mp[diff1].second){
                count += mp[diff1].first;
            }
             if(mp.find(diff2) != mp.end() && i>mp[diff1].second){
                count += mp[diff2].first;
             }
            
             mp[nums[i]].first++;
            mp[nums[i]].second = i;
            
        }
        return count;
    }
};