// Last updated: 16/10/2025, 04:25:31
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int curSum = 0;
        int maxSum = kadanes(nums, false);
        int minSum = kadanes(nums, true);
        int totalSum = Arrays.stream(nums).sum();

        //all numbers in the array nums are negative, return maxSum;
        if(totalSum == minSum){
            return maxSum;
        }

        int circularSum = totalSum - minSum;

        return Math.max(circularSum, maxSum);

    }

    public int kadanes(int[] nums, boolean findMin) {
        int n = nums.length;
        int curSum = 0;
        int result = findMin == true ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(findMin){
                curSum += nums[i];
                curSum = Math.min(curSum, nums[i]);
                result = Math.min(result, curSum);
            }else{
                curSum += nums[i];
                curSum = Math.max(curSum, nums[i]);
                result = Math.max(curSum, result);
            }
            
        }
        return result;
    }
}