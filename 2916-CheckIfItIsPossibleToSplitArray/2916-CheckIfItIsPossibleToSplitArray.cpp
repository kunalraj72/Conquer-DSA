// Last updated: 16/10/2025, 04:23:57
class Solution {
public:
    bool canSplitArray(vector<int>& nums, int m) {
        int n = nums.size();
        if(n <= 2){
            return true;
        }
        if(nums[0] + nums[1] >= m){
            return true;
        }
        else if(nums[n-1] + nums[n-2] >= m){
            return true;
        }
        else{
            for(int i=0;i<n-1;i++){
                if(nums[i] + nums[i+1] >= m){
                    return true;
                }
            }
        }
        return false;
        
    }
};