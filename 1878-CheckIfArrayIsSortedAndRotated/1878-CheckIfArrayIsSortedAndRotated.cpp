// Last updated: 16/10/2025, 04:24:50
class Solution {
public:
    bool check(vector<int>& nums) {
        int n = nums.size();
        int count = 0;
        for(int i=0;i<nums.size()-1;i++){
            if( nums[i] > nums[i+1]){
                count++;
            }
        }
        if(count == 0 || count == 1 && nums[n-1] <= nums[0]){
            return true; 
        }
        return false;
    }
};