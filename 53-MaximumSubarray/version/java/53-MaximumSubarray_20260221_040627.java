// Last updated: 21/02/2026, 04:06:27
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int n = nums.length;
4        int curSum = 0;
5        int maxSum = Integer.MIN_VALUE;
6        
7        for(int i = 0; i < n; i++){
8            curSum += nums[i];
9            maxSum = Math.max(curSum, maxSum);
10            if(curSum < 0){
11                curSum = 0;
12            }
13            
14        }
15        return maxSum;
16    }
17}