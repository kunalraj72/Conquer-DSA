// Last updated: 16/10/2025, 04:28:05
class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        int n=nums.size();
        bool flag=0;
        sort(nums.begin(),nums.end());
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                flag=1;
                break;
                
            }
        }
        return flag;
    }
};