// Last updated: 16/10/2025, 04:24:52
class Solution {
public:
    int maxOperations(vector<int>& nums, int k) {
        unordered_map<int,int>mp;
        int count = 0;
         int n = nums.size();
        for(int i=0;i<n;i++){
            int b = k-nums[i];
            if(mp[b]>0){
                count++;
                mp[b]--;
            }else{
                mp[nums[i]]++;
            }
            
        }
        return count;

        
    }
};