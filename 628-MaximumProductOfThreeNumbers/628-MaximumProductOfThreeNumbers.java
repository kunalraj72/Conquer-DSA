// Last updated: 16/10/2025, 04:26:19
class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int num1,nums2,num3;
        int prod1 = nums[n-1]*nums[n-2]*nums[n-3]; //All positive Ex. nums = [1,2,3,4]
        int prod2 = nums[0]*nums[1]*nums[2];  //All negative Ex. nums = [-1,-2,-3,-4]
        int prod3 = nums[0]*nums[1]*nums[n-1]; //Both positive and negative Ex. nums = [-1,-1,3,4]
        //Do dry run u will understand{Greedy Approach}
        
        return Math.max(prod3,Math.max(prod1,prod2));
    }
}