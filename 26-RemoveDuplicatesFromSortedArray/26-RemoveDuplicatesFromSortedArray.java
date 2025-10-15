// Last updated: 16/10/2025, 04:31:09
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = 0;

        while(s < n){
            if(nums[s] == nums[e]){
                s++;
            }
            else{
                nums[++e] = nums[s++];
            }
        }
        return e + 1;
    }
}