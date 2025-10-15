// Last updated: 16/10/2025, 04:31:07
class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int cur = 0;
        int last = 0;

        while(cur < n){
            if(nums[cur] != val){
                nums[last++] = nums[cur];
            }
            cur++;
        }
        return last;
    }
}