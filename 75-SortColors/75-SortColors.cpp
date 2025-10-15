// Last updated: 16/10/2025, 04:30:10
class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n = nums.size();
        int l=0,m=0;
        int h = n-1;
        while(m <= h){ // [2,0,1] : Try this test case u will understand why equality.
            if(nums[m] == 0){
                swap(nums[m++],nums[l++]);
            }
            else if(nums[m] == 1){
                m++;
            }
            else if(nums[m] == 2){
                swap(nums[m],nums[h--]); 
            }
        }
    }
};