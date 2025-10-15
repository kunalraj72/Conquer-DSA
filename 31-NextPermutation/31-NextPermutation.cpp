// Last updated: 16/10/2025, 04:31:05
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        //See green notebook for hint(Luv babbar solution)
        int n = nums.size();
        int idx1 = -1;
        for(int i = n-2; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                idx1 = i;
                break;
            }
        }
        if(idx1 == -1){
            reverse(nums.begin(),nums.end());
            return;
        }
        
        int idx2 = -1;
        
        for(int i = n-1; i >= 0; i--){
            if(nums[i] > nums[idx1]){
                idx2 = i;
                break;
            }
        }
        swap(nums[idx1],nums[idx2]);
        reverse(nums.begin()+idx1+1,nums.end());
    }
};