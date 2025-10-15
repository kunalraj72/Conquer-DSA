// Last updated: 16/10/2025, 04:25:22
//Video: https://www.youtube.com/watch?v=akwRFY2eyXs

class Solution {
public:
    
     int atMost(vector<int>&arr, int n, int k){
        int s=0, e=0;
        int count = 0;
        unordered_map<int,int> mp;
        while(e < n){
            mp[arr[e]]++;
            if(mp.size() > k){
                while(mp.size() > k){
                    mp[arr[s]]--;
                    if(mp[arr[s]] == 0){
                        mp.erase(arr[s]);
                    }
                    s++;
                }
            }
            count += e - s + 1;
            e++;
        }
        return count;
    }
    
    int subarraysWithKDistinct(vector<int>& nums, int k) {
        int N = nums.size();
        return atMost(nums,N,k) - atMost(nums,N,k-1);
    }
};