// Last updated: 16/10/2025, 04:24:01
#include<unordered_map>
class Solution {
public:
    bool isGood(vector<int>& nums) {
        int n = nums.size();
        unordered_map<int,int> mp;
        for(auto it : nums){
            mp[it]++;
        }
        int i;
        for(i=1;i<n-1;i++){
            if(mp[i] == 1){
                continue;
            }else{
                return false;
            }
        }
        if(mp[i] == 2){
            return true;
        }
        return false;
    }
};