// Last updated: 16/10/2025, 04:28:33
class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxDiff = 0;
        for(int i = 1; i < n; i++){
            maxDiff = Math.max(maxDiff, nums[i] - nums[i - 1]);
        }
        return maxDiff;
    }
}