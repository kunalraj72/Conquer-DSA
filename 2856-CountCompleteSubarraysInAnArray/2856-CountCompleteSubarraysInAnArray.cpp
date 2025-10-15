// Last updated: 16/10/2025, 04:24:08
#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    
    
    int countCompleteSubarrays(vector<int>& nums) {
        int n = nums.size();
        int cnt = 0;
        set<int> s;
        for(int i=0;i<n;i++){
            s.insert(nums[i]);
        }
        int dist = s.size();
        int i=0;
        unordered_map<int,int> mp;
        for(int j=0;j<n;j++){
            mp[nums[j]]++;
                while(mp.size() == dist){
                    cnt += n-j;
                    mp[nums[i]]--;
                    if(mp[nums[i]] == 0){
                        mp.erase(nums[i]);
                    }
                    i++;
                }
        }
        return cnt;
    }
};