// Last updated: 16/10/2025, 04:26:22
import java.util.*;
class Solution {
    public int arrayPairSum(int[] nums) {
        int maxSum = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i+=2){
            maxSum += nums[i];
        }
        return maxSum;
    }
}