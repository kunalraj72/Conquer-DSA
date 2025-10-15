// Last updated: 16/10/2025, 04:26:07
class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // Check if leftSum equals the right sum
            int rightSum = totalSum - leftSum - nums[i];
           if (leftSum == rightSum) {
               return i; // Pivot index found
            }
            leftSum += nums[i]; // Update leftSum
        }

        return -1; // No pivot index found
    }
}