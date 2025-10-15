// Last updated: 16/10/2025, 04:24:32
class Solution {
    public int[] rearrangeArray(int[] nums) {
       
        int n = nums.length;
        int oIndex = 1;
        int eIndex = 0;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] >= 0){
                ans[eIndex] = nums[i];
                eIndex += 2;
            }
            else{
                ans[oIndex] = nums[i];
                oIndex += 2;
            }
        }
        return ans;
   }
}