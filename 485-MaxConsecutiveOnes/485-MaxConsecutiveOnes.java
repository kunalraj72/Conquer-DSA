// Last updated: 16/10/2025, 04:26:49
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxOne = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                count++;
            }else{
                count = 0;
            }
            maxOne = Math.max(maxOne,count);
        }
        return maxOne;
    }
}


