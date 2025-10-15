// Last updated: 16/10/2025, 04:31:16
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n = nums.size();
        int j = 1;
        int i=0;
        while(i < n-1){
            if(nums[i] != nums[i+1]){
                nums[j++] = nums[i+1];
            }
            i++;
        }
        return j;
    }
};

 