// Last updated: 16/10/2025, 04:26:17
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(i < k){
                maxSum = sum;
                continue;
            }
            else{
                sum -= nums[i-k];
                maxSum = Math.max(sum,maxSum);
            }
        }
        return (double)maxSum / k;
    }
}