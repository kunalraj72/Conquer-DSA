// Last updated: 16/10/2025, 04:24:54
class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int target = Arrays.stream(nums).sum() - x;
        if(target < 0) return -1;
        if(target == 0) return n;

        int i = 0, j = 0;
        int sum = 0;
        int maxLen = Integer.MIN_VALUE;

        while(j < n){
            sum += nums[j];
            if(sum > target){
                while(sum > target && i <= j){
                    sum -= nums[i];
                    i++;
                }
            }
            if(sum == target && i <= j){
                maxLen = Math.max(maxLen, j - i + 1);
            }
            j++;
        }
        return maxLen == Integer.MIN_VALUE ? -1 : n - maxLen;
    }
}